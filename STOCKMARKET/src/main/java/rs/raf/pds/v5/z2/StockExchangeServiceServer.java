package rs.raf.pds.v5.z2;

import com.google.protobuf.Timestamp;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import rs.raf.pds.v5.z2.gRPC.*;
import rs.raf.pds.v5.z2.gRPC.StockExchangeServiceGrpc.StockExchangeServiceImplBase;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class StockExchangeServiceServer {

	static private ConcurrentHashMap<String, List<String>> subscribers = new ConcurrentHashMap<>();
	static private ConcurrentHashMap<String,List<StockData>> history = new ConcurrentHashMap<>();

	static private  ConcurrentHashMap<String, StockData> stockMap = new ConcurrentHashMap<String, StockData>();


	public static void main(String[] args) throws IOException, InterruptedException {

		//private ConcurrentHashMap<String, List<String>> subscribers = new ConcurrentHashMap<>();

		//StockExchangeServiceServer stockExchangeServer = new StockExchangeServiceServer();
		Server server = ServerBuilder
          .forPort(8090)
          .addService(new StockExchangeServiceImpl()).build();

        server.start();
        //server.awaitTermination();
		StockExchangeServiceServer.StockExchangeServiceImpl serviceImpl = new StockExchangeServiceServer.StockExchangeServiceImpl();

		new Thread(serviceImpl::startSocketServer).start();
		serviceImpl.scheduleDoneTradesUpdate();
		//serviceImpl.testSendTcpStockUpdates();
		serviceImpl.sendTcpStockUpdates();




		//server.awaitTermination();

	}

	static class StockExchangeServiceImpl extends StockExchangeServiceImplBase {
		int count=0;
		private final Map<String, Socket> connections = new ConcurrentHashMap<>();
		private final Map<String, Client> registeredClients = new ConcurrentHashMap<>();
		//private final ConcurrentHashMap<String, StockData> stockMap = new ConcurrentHashMap<String, StockData>();
		// private ConcurrentHashMap<String, List<String>> subscribers = new ConcurrentHashMap<>();
		private List<Order> trades = new ArrayList<>();
		private List<Order> orders=new ArrayList<>();

		private List<Client> clients = new ArrayList<>();

		//private ConcurrentHashMap<String, List<StockInfo>> clientShares = new ConcurrentHashMap<>();

		private void startSocketServer() {
			System.out.println("Trying to start server on port 7999");
			try (ServerSocket serverSocket = new ServerSocket(7999)) {
				System.out.println("Socket server started on port 7999");
				while (true) {
					Socket clientSocket = serverSocket.accept();
					System.out.println("New client connected on port: " + clientSocket.getPort());

					// Handle the socket client in a new thread
					new Thread(() -> handleSocketClient(clientSocket)).start();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		private void handleSocketClient(Socket clientSocket) {
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				 PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {

				String userId = reader.readLine();
				connections.put(userId, clientSocket);





				while (true) {
					if (clientSocket.isClosed()) {
						System.out.println("Client disconnected: " + clientSocket.getInetAddress() + " User: " + userId);
						connections.remove(userId);
						registeredClients.remove(userId);
						break;
					}

					Thread.sleep(1000);
				}

			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}


		private void testSendTcpStockUpdates() {
			ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

			// Schedule the task to run every 6 minutes
			scheduler.scheduleAtFixedRate(() -> {
 				//System.out.println(subscribers);
			}, 0, 10000, TimeUnit.MILLISECONDS);
		}


		private void sendTcpStockUpdates() {

			Timer timer = new Timer();
			timer.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					//System.out.println(subscribers);
					for (Map.Entry<String, List<String>> entry : subscribers.entrySet()) {
						String stockSymbol = entry.getKey(); // Get the stock symbol
						//System.out.println(stockSymbol+"ovo je simbol");

						List<String> subscribers2 = entry.getValue(); // Get the Set of subscribers for this stock symbol
						//System.out.println(subscribers2+"ovo je lista");

						//if(!(subscribers2.isEmpty())){
							//System.out.println("1Stock Symbol: " + stockSymbol + " has subscribers:");

						//}
						//System.out.println("2Stock Symbol: " + stockSymbol + " has subscribers:"+subscribers);
						for (String subscriberId : subscribers2) {

							for (Map.Entry<String, StockData> c : stockMap.entrySet()) {

								String output="";
								if(c.getValue().getSymbol().equals(stockSymbol)){
									StockData data = c.getValue();

									double percentChange=0;
									double change= data.getPriceAtStart();
									System.out.println(data.getPriceAtStart() +"ovo je stockmap iz updates");

									if(history.get(data.getSymbol()).size()>1){

										Number[] nums = calculateHistory(data);
										 percentChange= (double) nums[0];
										 change =(double)nums[1];
									}


									System.out.println(percentChange+"ovde sam");
									System.out.println(change);

									String directionSymbol = change > 0 ? "↑" : (change < 0 ? "↓" : "");
									String colorCode = change > 0 ? "\u001B[32m" : (change < 0 ? "\u001B[31m" : "\u001B[0m");
									output+= String.format("%s%s %.2f %s%.2f%% %s\u001B[0m", // Format string
											colorCode,
											data.getSymbol(),
											data.getPriceAtStart(),
											change >= 0 ? "+" : "-",
											percentChange,
											directionSymbol);

								}

									Socket clientSocket = connections.get(subscriberId);

									if (!output.isEmpty()&&clientSocket != null && !clientSocket.isClosed()) {
										try {
											PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
											writer.println(output);
										} catch (IOException e) {
											e.printStackTrace();
										}
									}


							}

						}
						}

					}
			},0,10000);
			}


		public static Number[] calculateHistory(StockData data){
			String symbol=data.getSymbol();
			double price= data.getPriceAtStart();
			System.out.println(price+"u histori");
			double percent=0;
			double abs=0;
			Number[] numbers = new Number[2];

			Instant instant = Instant.now();
			Timestamp t = Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).build();
			Timestamp t1h= Timestamp.newBuilder().setSeconds(t.getSeconds()-3600).build();
			List<StockData> stockHistory = history.get(symbol);
			for (int i = stockHistory.size() - 1; i >= 0; i--) {
				StockData stock = stockHistory.get(i);
					if (stock.getDate().getSeconds()>t1h.getSeconds()){
						//percent=(price*100)/stock.getPriceAtStart();
						//percent=100-percent;
						// <333333333333333333333333
						// from nikolicy with luv
						// <33333333
						percent = (Math.abs(price - stock.getPriceAtStart()) / price)*100;
						abs=price-stock.getPriceAtStart();
						System.out.println(percent+"iz histori");
						System.out.println(abs+"iz histori");
						System.out.println(percent);
					}
				}

			numbers[0]=percent;
			numbers[1]=abs;
			return numbers;
		}


		protected StockExchangeServiceImpl() {
			initUnos();
		}



		protected void initUnos() {
			for (StockData data: InitialData.loadStockData("C:\\Users\\mik\\Downloads\\STOCKMARKET2\\stock-market\\STOCKMARKET\\src\\main\\java\\rs\\raf\\pds\\v5\\z2\\nasdaq.csv")) {
				if (data != null) {
					stockMap.put(data.getSymbol(),data);
					subscribers.put(data.getSymbol(),new ArrayList<>());
					history.put(data.getSymbol(),new ArrayList<>());
					history.get(data.getSymbol()).add(data);
					//System.out.println(history);

				} else {
					System.out.println("nema");
				}
			}

		}
		private static final long UPDATE_INTERVAL = 6 * 60 * 1000; // 6 minutes in milliseconds

		private void scheduleDoneTradesUpdate() {
			ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

			scheduler.scheduleAtFixedRate(() -> {
				writeDoneTradesToFile();
			}, 0, 10000, TimeUnit.MINUTES);
		}



		private void writeDoneTradesToFile() {
			File file = new File("C:\\Users\\mik\\Downloads\\STOCKMARKET2\\trades.txt");
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
				if (file.exists()) {
					file.delete();
				}
				writer.write("Trades\n");
				for (Order order : trades) {

					String line = order.getOrderId() + "," + order.getClientId() + "," + order.getSymbol() + "," +
							order.getNumShares() + "," + order.getPrice();
					writer.write(line);
					writer.newLine();
				}
				System.out.println("uspesno upisano");
			} catch (IOException e) {
				System.err.println("Error pri upisivanju: " + e.getMessage());
			}
		}
		@Override
		public void getAllStockData(EmptyMessage request, StreamObserver<StockData> responseObserver) {
			System.out.println(stockMap.values());

			for (StockData data : stockMap.values()) {
				if (data != null) {
					responseObserver.onNext(data);
				}
			}

			responseObserver.onCompleted();
		}
		public void registerClient(Client request, StreamObserver<RegisterResponse> responseObserver) {

			boolean registrationSuccess = true;
			registeredClients.put(request.getClientId(), request);
			System.out.println(registeredClients+"iz registerclient");

			RegisterResponse response = RegisterResponse.newBuilder()
					.setSuccess(registrationSuccess)
					.build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}

		public void addSubscriber(SubscriptionRequest request, StreamObserver<SubscribeResponse> responseObserver) {
			List<String> symbols = request.getSymbolsList();
			String clientId = request.getClientId();

			for (String symbol : symbols) {
				subscribers.compute(symbol, (key, clientList) -> {
					if (!clientList.contains(clientId)) {
						clientList.add(clientId);
					}
					return clientList;
				});
			}
			SubscribeResponse response = SubscribeResponse.newBuilder()
					.setSuccess(true)
					.build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
		public void placeOrder(Order request, StreamObserver<OrderResponse> responseObserver) {
			String symbol = request.getSymbol();
			double price = request.getPrice();
			int quantity = request.getNumShares();
			String clientId = request.getClientId();
			boolean isBid = request.getIsBid();//is bid je da li je za kupovinu akcija


			boolean orderMatched = false;

			// suprotni order, izvrsava se
			for (Order existingOrder : orders) {
				if (existingOrder.getSymbol().equals(symbol)
						&& existingOrder.getPrice() == price
						&& existingOrder.getNumShares() == quantity
						&& existingOrder.getIsBid() != isBid) {
					orderMatched = true;
					executeTrade(existingOrder, request);
					updateStockPrice(symbol,price);
					System.out.println(stockMap.get("CVCO")+"ovo je samo za cvco ");
					break;
				}
			}

			if (!orderMatched) {
				// No match found,dodajemo u pending
				String orderId = UUID.randomUUID().toString();
				orders.add(request.toBuilder().setOrderId(orderId).build());

			}
			System.out.println(orders+"ovo su sve orders iz placeorder");

			OrderResponse response = OrderResponse.newBuilder()
					.setSuccess(orderMatched)
					.build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
		private void executeTrade(Order matchedOrder, Order newOrder) {

			//ako se desi trade, obaveste se oba klijenta, updatuju se njihovi stockinfo
			// smesta se order u done trades i izbacuje iz liste pending
			//takodje se menja cena akcije kompanije globalno i salje se klijentima koji su pretplaceni

			String buyerId = newOrder.getIsBid() ? newOrder.getClientId() : matchedOrder.getClientId();
			String sellerId = newOrder.getIsBid() ? matchedOrder.getClientId() : newOrder.getClientId();

			// Update povecanje broja akcija kompanije koju ima kupac, smanjenje broja akcija koje ima prodavac
			updateClientAssets(buyerId, matchedOrder.getSymbol(), matchedOrder.getNumShares(), true); // true for buying
			updateClientAssets(sellerId, matchedOrder.getSymbol(), matchedOrder.getNumShares(), false); // false for selling


			// sklanjanje ordera iz liste pending ordera , smestanje u listu izvrsenih ordera
			orders.remove(matchedOrder);
			trades.add(matchedOrder);


			// Notify
			notifyClient(buyerId, "Your order to buy " + matchedOrder.getNumShares() + " shares of " + matchedOrder.getSymbol() + " at " + matchedOrder.getPrice() + " each has been executed.");
			notifyClient(sellerId, "Your order to sell " + matchedOrder.getNumShares() + " shares of " + matchedOrder.getSymbol() + " at " + matchedOrder.getPrice() + " each has been executed.");


		}
		private void notifyClient(String clientId, String message) {
			Socket clientSocket = connections.get(clientId);
			if (clientSocket != null && !clientSocket.isClosed()) {
				try (PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {
					out.println(message);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		public void getBidOffers(BidRequest request, StreamObserver<OrderList> responseObserver) {
			String symbol = request.getSymbol();
			int limit = request.getLimit();

			List<Order> bids = fetchOffers(symbol, true, limit);

			OrderList response = OrderList.newBuilder().addAllOffers(bids).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}


		public void getAskOffers(AskRequest request, StreamObserver<OrderList> responseObserver) {
			String symbol = request.getSymbol();
			int limit = request.getLimit();


			List<Order> asks = fetchOffers(symbol, false, limit);

			OrderList response = OrderList.newBuilder().addAllOffers(asks).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}

		private List<Order> fetchOffers(String symbol, boolean isBid, int limit) {

			List<Order> offers = new ArrayList<>();

			for (Order order : orders) {
				if (order.getSymbol().equals(symbol) && order.getIsBid() == isBid) {
					offers.add(order);
				}
			}

			// Sort
			// For buy offers, sort descending (higher price first); for sell offers, sort ascending (lower price first)
			offers.sort((o1, o2) -> isBid ? Double.compare(o2.getPrice(), o1.getPrice()) : Double.compare(o1.getPrice(), o2.getPrice()));

			// Limit
			if (limit > 0 && offers.size() > limit) {
				return offers.subList(0, limit);
			}

			return offers;
		}
		private void updateClientAssets(String clientId, String symbol, int quantity, boolean isBuy) {

			System.out.println(registeredClients+"ovo je registeredclients iz updateassets");
			Client client=registeredClients.get(clientId);
			List<StockInfo> updatedStocks = new ArrayList<>(client.getStocksList());
			for (int i = 0; i < updatedStocks.size(); i++) {
				StockInfo stockInfo = updatedStocks.get(i);
				if (stockInfo.getSymbol().equals(symbol)) {

					int updatedNumShares = isBuy ? stockInfo.getNumShares() + quantity : stockInfo.getNumShares() - quantity;

					StockInfo updatedStockInfo = stockInfo.toBuilder()
							.setNumShares(updatedNumShares)
							.build();

					updatedStocks.set(i, updatedStockInfo);
				}
			}

			Client updatedClient = client.toBuilder()
					.clearStocks()
					.addAllStocks(updatedStocks)
					.build();

			registeredClients.put(clientId, updatedClient);

			System.out.println(registeredClients+"ovo je registeredclients iz updateassets ali nakon promene ");


		}
		private void updateStockPrice(String symbol, double newPrice) {

			Instant instant = Instant.now();
			Timestamp t = Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).build();

			StockData stockData = stockMap.get(symbol);
			if (stockData != null) {

				StockData updatedStockData = stockData.toBuilder()
						.setPriceAtStart(newPrice)
						.setDate(t)
						.build();

				stockMap.put(symbol, updatedStockData);
				history.get(symbol).add(updatedStockData);
				System.out.println(stockMap +"ovo je stockmap iz update stock price");
				System.out.println(history.get("CVCO") +"ovo je history iz update stock price");



				// obavestavanje subscribera
				//notifyPriceUpdate(symbol, newPrice);
			} else {
				System.out.println("Stock symbol " + symbol + " not found in stockMap.");
			}
		}


	}
}