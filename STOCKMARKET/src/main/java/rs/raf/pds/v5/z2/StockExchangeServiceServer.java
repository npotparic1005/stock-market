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
import java.text.SimpleDateFormat;
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

	static private final Map<String, Client> registeredClients = new ConcurrentHashMap<>();

	static private ConcurrentHashMap<Timestamp, List<Order>> trades = new ConcurrentHashMap<>();



	//static private List<Order> trades = new ArrayList<>();


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
		private static final Map<String, Socket> connections = new ConcurrentHashMap<>();
		private final Map<String, Client> registeredClients = new ConcurrentHashMap<>();
		//private final ConcurrentHashMap<String, StockData> stockMap = new ConcurrentHashMap<String, StockData>();
		// private ConcurrentHashMap<String, List<String>> subscribers = new ConcurrentHashMap<>();
		//private List<Order> trades = new ArrayList<>();
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

					feed();

					}
			},0,60000);
			}


		public static void feed(){
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
							//System.out.println(data.getPriceAtStart() +"ovo je stockmap iz updates");
							String changeString = "0% 0% 0%";

							if(history.get(data.getSymbol()).size()>1){

								Number[] nums = calculateHistory(data);
								double percent1h = (double) nums[0];
								double change1h = (double) nums[1];
								double percent24h = (double) nums[2];
								double change24h = (double) nums[3];
								double percent7d = (double) nums[4];
								double change7d = (double) nums[5];

								changeString = String.format("%s%s%.2f%% %s\u001B[0m %s%s%.2f%% %s\u001B[0m %s%s%.2f%% %s\u001B[0m",
										change1h > 0 ? "\u001B[32m" : (change1h < 0 ? "\u001B[31m" : "\u001B[0m"),
										change1h >= 0 ? "+" : "-",
										percent1h,
										change1h > 0 ? "↑" : (change1h < 0 ? "↓" : ""),

										change24h > 0 ? "\u001B[32m" : (change24h < 0 ? "\u001B[31m" : "\u001B[0m"),
										change24h >= 0 ? "+" : "-",
										percent24h,
										change24h > 0 ? "↑" : (change24h < 0 ? "↓" : ""),

										change7d > 0 ? "\u001B[32m" : (change7d < 0 ? "\u001B[31m" : "\u001B[0m"),
										change7d >= 0 ? "+" : "-",
										percent7d,
										change7d > 0 ? "↑" : (change7d < 0 ? "↓" : "")
										);

								percentChange= (double) nums[0];
								change =(double)nums[1];
							}


							System.out.println(percentChange+"ovde sam");
							System.out.println(change);

							String directionSymbol = change > 0 ? "↑" : (change < 0 ? "↓" : "");
							String colorCode = change > 0 ? "\u001B[32m" : (change < 0 ? "\u001B[31m" : "\u001B[0m");
							output+= String.format("%s %.2f %s", // Format string
									data.getSymbol(),
									data.getPriceAtStart(),
									changeString);

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
		public static Number[] calculateHistory(StockData data){
			String symbol=data.getSymbol();
			double price= data.getPriceAtStart();
			//System.out.println(price+"u histori");
			double percent1h=0, abs1h=0, percent24h=0, abs24h=0, percent7d=0, abs7d=0;
			Number[] numbers = new Number[6];

			Instant instant = Instant.now();
			Timestamp t = Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).build();
			int hour = 3600;
			int day = hour * 24;
			int week = day * 7;
			Timestamp t1h= Timestamp.newBuilder().setSeconds(t.getSeconds() - hour).build();
			Timestamp t24h= Timestamp.newBuilder().setSeconds(t.getSeconds() - day).build();
			Timestamp t7d= Timestamp.newBuilder().setSeconds(t.getSeconds() - week).build();
			List<StockData> stockHistory = history.get(symbol);
			for (int i = stockHistory.size() - 1; i >= 0; i--) {
				StockData stock = stockHistory.get(i);
					if (stock.getDate().getSeconds()>t1h.getSeconds()){
						percent1h = (Math.abs(price - stock.getPriceAtStart()) / (price > stock.getPriceAtStart() ? price : stock.getPriceAtStart()))*100;
						abs1h = price-stock.getPriceAtStart();
					}

					if (stock.getDate().getSeconds()>t24h.getSeconds()){
						percent24h = (Math.abs(price - stock.getPriceAtStart()) / (price > stock.getPriceAtStart() ? price : stock.getPriceAtStart()))*100;
						abs24h = price-stock.getPriceAtStart();
					}

					if (stock.getDate().getSeconds()>t7d.getSeconds()){
						percent7d = (Math.abs(price - stock.getPriceAtStart()) / (price > stock.getPriceAtStart() ? price : stock.getPriceAtStart()))*100;
						abs7d = price-stock.getPriceAtStart();
					}
				}

			numbers[0]=percent1h;
			numbers[1]=abs1h;

			numbers[2]=percent24h;
			numbers[3]=abs24h;

			numbers[4]=percent7d;
			numbers[5]=abs7d;

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


			Instant instant = Instant.now();
			Timestamp t = Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).build();
			int hour = 3600, day = hour * 24, week = day * 7;

			Timestamp t24h= Timestamp.newBuilder().setSeconds(t.getSeconds() - day + 5000).build();
			Timestamp t7d= Timestamp.newBuilder().setSeconds(t.getSeconds() - week + 5000).build();

			// Simulation defaults
			StockData cvcoSimulationTrade24h = StockData.newBuilder()
					.setSymbol("CVCO")
					.setCompanyName("Cvco Industries Inc.")
					.setPriceAtStart(164.5)
					.setPriceChange(15)
					.setDate(t24h)
					.build();

			StockData cvcoSimulationTrade7d = StockData.newBuilder()
					.setSymbol("CVCO")
					.setCompanyName("Cvco Industries Inc.")
					.setPriceAtStart(540)
					.setPriceChange(30)
					.setDate(t7d)
					.build();

			history.get("CVCO").add(0, cvcoSimulationTrade24h);
			history.get("CVCO").add(0, cvcoSimulationTrade7d);
		}
		private static final long UPDATE_INTERVAL = 6 * 60 * 1000; // 6 minutes in milliseconds

		private void scheduleDoneTradesUpdate() {
			ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

			scheduler.scheduleAtFixedRate(this::writeDoneTradesToFile, 0, 1, TimeUnit.MINUTES);
		}



		private void writeDoneTradesToFile() {
			File file = new File("C:\\Users\\mik\\Downloads\\STOCKMARKET2\\trades.txt");
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
				if (file.exists()) {
					file.delete();
				}
				writer.write("Trades\n");
				for (Map.Entry<Timestamp, List<Order>> entry : trades.entrySet()) {
					Timestamp timestamp = entry.getKey();  // This is the timestamp key in your map
					List<Order> ordersList = entry.getValue();  // This is the list of orders associated with the timestamp

					Date date = new Date(timestamp.getSeconds() * 1000L);

					for (Order order : ordersList) {
						String line = String.format("DATE: %s, Order ID: %s, OWNER ID: %s, COMPANY NAME: %s, NUMBER OF SHARES: %d, PRICE: %.2f",
								date,
								order.getOrderId(),
								order.getClientId(),
								order.getSymbol(),
								order.getNumShares(),
								order.getPrice());

						writer.write(line);
						writer.newLine();
						System.out.println("Successfully written");
					}
				}

			} catch (IOException e) {
				System.err.println("Error pri upisivanju: " + e.getMessage());
			}
		}
		public void getTrades(TradesRequest request, StreamObserver<OrderList> responseObserver) {

			String s = request.getS();

			List<Order> matched=new ArrayList<>();


			for (Map.Entry<Timestamp, List<Order>> c : trades.entrySet()) {
				Timestamp t2=c.getKey();
				Date date2=new Date(t2.getSeconds()*1000);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				//String strDate1 = sdf.format(s);
				String strDate2 = sdf.format(date2);
				if (s.equals(strDate2)) {
					System.out.println("The dates are equal.");
					matched.addAll(c.getValue());
					System.out.println(matched);

				}
			}
				System.out.println(matched);

			OrderList response = OrderList.newBuilder().addAllOffers(matched).build();

			responseObserver.onNext(response);
			responseObserver.onCompleted();

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

			if (!isBid && !hasEnoughShares(clientId, symbol, quantity)) {
				//notifyClient(clientId, "Ne posedujete akcije ove kompanije, ili ne posedujete dovoljno akcija: " + symbol);

				OrderResponse response = OrderResponse.newBuilder().setFailed(true).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
				return;
			}

			// suprotni order, izvrsava se
			for (Order existingOrder : orders) {
				if (existingOrder.getSymbol().equals(symbol)
						&& existingOrder.getPrice() == price
						&& existingOrder.getNumShares() == quantity
						&& existingOrder.getIsBid() != isBid) {
					orderMatched = true;
					executeTrade(existingOrder, request);
					updateStockPrice(symbol,price);
					feed();
					//System.out.println(stockMap.get("CVCO")+"ovo je samo za cvco ");
					OrderResponse response = OrderResponse.newBuilder().setTransaction(true).build();
					responseObserver.onNext(response);
					responseObserver.onCompleted();
					return;
				}
			}

			if (!orderMatched) {
				// No match found,dodajemo u pending
				String orderId = UUID.randomUUID().toString();
				orders.add(request.toBuilder().setOrderId(orderId).build());

			}
			//System.out.println(orders+"ovo su sve orders iz placeorder");

			OrderResponse response = OrderResponse.newBuilder()
					.setSuccess(true)
					.build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}

		private boolean hasEnoughShares(String clientId, String symbol, int quantity) {
			Client client = registeredClients.get(clientId);
			if (client == null) {
				return false;
			}

			for (StockInfo stockInfo : client.getStocksList()) {
				if (stockInfo.getSymbol().equals(symbol) && stockInfo.getNumShares() >= quantity) {
					return true;
				}
			}

			return false;
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
			Instant instant = Instant.now();
			Timestamp t = Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).build();
			addOrderToTrades(t,matchedOrder);

			// Notify
			notifyClient(buyerId, "Your order to buy " + matchedOrder.getNumShares() + " shares of " + matchedOrder.getSymbol() + " at " + matchedOrder.getPrice() + " each has been executed.");
			notifyClient(sellerId, "Your order to sell " + matchedOrder.getNumShares() + " shares of " + matchedOrder.getSymbol() + " at " + matchedOrder.getPrice() + " each has been executed.");


		}

		public static void addOrderToTrades(Timestamp timestamp, Order order) {
			trades.compute(timestamp, (key, orderList) -> {
				if (orderList == null) {
					orderList = new ArrayList<>();
				}
				orderList.add(order);
				return orderList;
			});
		}
		private void notifyClient(String clientId, String message) {
			Socket clientSocket = connections.get(clientId);
			if (clientSocket != null && !clientSocket.isClosed()) {
				try {
					PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
					out.println(message); // Send the message
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

			//System.out.println(registeredClients+"ovo je registeredclients iz updateassets");
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

			//System.out.println(registeredClients+"ovo je registeredclients iz updateassets ali nakon promene ");


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
				//System.out.println(stockMap +"ovo je stockmap iz update stock price");
				//System.out.println(history.get("CVCO") +"ovo je history iz update stock price");



				// obavestavanje subscribera
				//notifyPriceUpdate(symbol, newPrice);
			} else {
				System.out.println("Stock symbol " + symbol + " not found in stockMap.");
			}
		}


	}
}