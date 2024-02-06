package rs.raf.pds.v5.z2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import io.grpc.*;
import rs.raf.pds.v5.z2.gRPC.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannel;


public class StudentServiceClient extends StudentServiceGrpc.StudentServiceImplBase {

	private Client client;
	private Socket tcpSocket;
	StockExchangeServiceGrpc.StockExchangeServiceBlockingStub blockingStub;

	private final ManagedChannel grpcChannel;


	public StudentServiceClient(ManagedChannel channel) {
		blockingStub = StockExchangeServiceGrpc.newBlockingStub(channel);
		this.client = generateClient();
		grpcChannel = channel;

	}


	private static Client generateClient() {

		String clientId = UUID.randomUUID().toString();


		StockInfo stock1 = StockInfo.newBuilder()

				.setSymbol("CVCO")
				.setNumShares(100)
				.build();



		StockInfo stock2 = StockInfo.newBuilder()

				.setSymbol("MSTF")
				.setNumShares(100)
				.build();

		StockInfo grntStock = StockInfo.newBuilder()
				.setSymbol("GRNT")
				.setNumShares(100)
				.build();

		StockInfo gromStock = StockInfo.newBuilder()
				.setSymbol("GROM")
				.setNumShares(100)
				.build();

		StockInfo grovStock = StockInfo.newBuilder()
				.setSymbol("GROV")
				.setNumShares(100)
				.build();

		StockInfo growStock = StockInfo.newBuilder()
				.setSymbol("GROW")
				.setNumShares(100)
				.build();

		StockInfo groyStock = StockInfo.newBuilder()
				.setSymbol("GROY")
				.setNumShares(100)
				.build();

		Client client = Client.newBuilder()
				.setClientId(clientId)
				.addStocks(stock1)
				.addStocks(stock2)
				.addStocks(grntStock)
				.addStocks(gromStock)
				.addStocks(grovStock)
				.addStocks(growStock)
				.addStocks(groyStock)
				.build();


		return client;
	}

	private void sendUserIdToServer() {
		try {
			tcpSocket = new Socket("localhost", 7999);
			PrintWriter writer = new PrintWriter(tcpSocket.getOutputStream(), true);
			writer.println(client);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


public static void main(String[] args) throws UnknownHostException, IOException {
	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090)
			.usePlaintext()
			.build();
	StudentServiceClient client = new StudentServiceClient(channel);
	registerClient(client);




	//registerClient(client);

	try(Socket socket = new Socket("localhost",7999)){
		System.out.println("Client connected." );


		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
		String userId = client.client.getClientId();
		writer.println(userId);
		Scanner scanner = new Scanner(System.in);
		Thread serverListener = new Thread(() -> {
			String serverMessage;
			try {
				while ((serverMessage = in.readLine()) != null) {

					System.out.println(serverMessage);


				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		serverListener.start();

		Thread grpcThread = new Thread(() -> {
			while (true) {
				// Handle user input continuously
				handleUserInput(client, scanner, client.blockingStub);
			}
		});

		grpcThread.start();

		try {
			grpcThread.join();
			serverListener.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	}
	channel.shutdown();
}
	private static void registerClient(StudentServiceClient client) {
		try {
			RegisterResponse registerResponse = client.blockingStub.registerClient(client.client);

			if (registerResponse.getSuccess()) {
				System.out.println("Client registration successful. Client ID: " + client.client.getClientId());
			} else {
				System.out.println("Client registration failed.");
			}
		} catch (StatusRuntimeException e) {
			System.out.println("Error registering client: " + e.getStatus());
		}
	}
	public void subscribeToStocks(List<String> symbols, String clientId, StockExchangeServiceGrpc.StockExchangeServiceBlockingStub blockingStub) {
		SubscriptionRequest request = SubscriptionRequest.newBuilder()
				.setClientId(clientId)
				.addAllSymbols(symbols)
				.build();

		try {
			SubscribeResponse response = blockingStub.addSubscriber(request);

			System.out.println("Subscription successful.");
		} catch (StatusRuntimeException e) {
			System.err.println("RPC failed: " + e.getStatus());
		}
	}
	public void placeOrder(String clientId, String symbol, double price, int numShares, boolean isBid, StockExchangeServiceGrpc.StockExchangeServiceBlockingStub blockingStub) {
		Order order = Order.newBuilder()
				.setClientId(clientId)
				.setSymbol(symbol)
				.setPrice(price)
				.setNumShares(numShares)
				.setIsBid(isBid) // true for buy order, false for sell order
				.setOrderId(UUID.randomUUID().toString())
				.build();

		try {
			OrderResponse response = blockingStub.placeOrder(order);
			if (response.getSuccess()) {
				System.out.println("Order added to pending list.");
			} else if(response.getTransaction()) {
				//System.out.println("Transaction executed. ");
			}else if(response.getFailed()){
				System.out.println("You don't have enough shares of this company.");
			}
		} catch (StatusRuntimeException e) {
			System.err.println("RPC failed: " + e.getStatus());
		}
	}
	public void getAskOffers(String symbol, int limit, StockExchangeServiceGrpc.StockExchangeServiceBlockingStub blockingStub) {
		AskRequest request = AskRequest.newBuilder()
				.setSymbol(symbol)
				.setLimit(limit)
				.build();

		try {
			OrderList response = blockingStub.getAskOffers(request);
			System.out.println("Ask offers for " + symbol + ":");
			for (Order order : response.getOffersList()) {
				System.out.println("Client ID: " + order.getClientId() +
						", Symbol: " + order.getSymbol() +
						", Price: " + order.getPrice() +
						", Quantity: " + order.getNumShares());
			}
		} catch (StatusRuntimeException e) {
			System.err.println("RPC failed: " + e.getStatus());
		}
	}


	public void getBidOffers(String symbol, int limit, StockExchangeServiceGrpc.StockExchangeServiceBlockingStub blockingStub) {
		BidRequest request = BidRequest.newBuilder()
				.setSymbol(symbol)
				.setLimit(limit)
				.build();

		try {
			OrderList response = blockingStub.getBidOffers(request);
			System.out.println("Bid offers for " + symbol + ":");
			for (Order order : response.getOffersList()) {
				System.out.println("Client ID: " + order.getClientId() +
						", Symbol: " + order.getSymbol() +
						", Price: " + order.getPrice() +
						", Quantity: " + order.getNumShares());
			}
		} catch (StatusRuntimeException e) {
			System.err.println("RPC failed: " + e.getStatus());
		}
	}
	private static final int UPDATE_INTERVAL = 6; // in minutes
	private static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	private static ScheduledFuture<?> scheduledFuture;

	private static void handleUserInput(StudentServiceClient grpcClient, Scanner scanner, StockExchangeServiceGrpc.StockExchangeServiceBlockingStub blockingStub) {
		System.out.println("Enter command:");
		String choice = scanner.nextLine();  // Read user input
		String[] parts = choice.split(" ");  // Split the input into parts

		try {
			switch (parts[0].toUpperCase()) {
				case "ASK":
					if (parts.length == 3) {
						String symbol = parts[1];
						int limit = Integer.parseInt(parts[2]);
						grpcClient.getAskOffers(symbol, limit, blockingStub);
					} else {
						System.out.println("Invalid ASK command format.");
					}
					break;

				case "BID":
					if (parts.length == 3) {
						String symbol = parts[1];
						int limit = Integer.parseInt(parts[2]);
						grpcClient.getBidOffers(symbol, limit, blockingStub);
					} else {
						System.out.println("Invalid BID command format.");
					}
					break;

				case "ORDERPRODAJA":
					if (parts.length == 4) {
						String symbol = parts[1];
						double price = Double.parseDouble(parts[2]);
						int numShares = Integer.parseInt(parts[3]);
						grpcClient.placeOrder(grpcClient.client.getClientId(), symbol, price, numShares, false, blockingStub);
					} else {
						System.out.println("Invalid ORDER command format.");
					}
					break;
				case "ORDERKUPOVINA":
					if (parts.length == 4) {
						String symbol = parts[1];
						double price = Double.parseDouble(parts[2]);
						int numShares = Integer.parseInt(parts[3]);
						grpcClient.placeOrder(grpcClient.client.getClientId(), symbol, price, numShares, true, blockingStub);
					} else {
						System.out.println("Invalid ORDER command format.");
					}
					break;

				case "SUBSCRIBE":
					if (parts.length > 1) {
						List<String> symbols = Arrays.asList(parts).subList(1, parts.length);
						grpcClient.subscribeToStocks(symbols, grpcClient.client.getClientId(), blockingStub);
					} else {
						System.out.println("Invalid SUBSCRIBE command format.");
					}
					break;


				default:
					System.out.println("Unknown command. Please try again.");
					break;
			}
		} catch (NumberFormatException e) {
			System.out.println("Error parsing command parameters: " + e.getMessage());
		} catch (StatusRuntimeException e) {
			System.out.println("RPC failed: " + e.getStatus());
		}
	}


}
