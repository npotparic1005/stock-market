package rs.raf.pds.v5.z2;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import rs.raf.pds.v5.z2.gRPC.*;
import rs.raf.pds.v5.z2.gRPC.StockExchangeServiceGrpc.StockExchangeServiceImplBase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;



public class StockExchangeServiceServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		StockExchangeServiceServer stockExchangeServer = new StockExchangeServiceServer();
		Server server = ServerBuilder
          .forPort(8090)
          .addService(new StockExchangeServiceImpl()).build();

        server.start();
        server.awaitTermination();

		new Thread(() -> stockExchangeServer.startSocketServer()).start();

	}
	private void startSocketServer() {
		try (ServerSocket serverSocket = new ServerSocket(5455)) {
			System.out.println("Socket server started on port 7999");
			while (true) {
				Socket clientSocket = serverSocket.accept();
				System.out.println("New client connected: " + clientSocket.getPort());

				// Handle the socket client in a new thread
				//new Thread(() -> handleSocketClient(clientSocket)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void handleSocketClient(Socket clientSocket) {
		try (
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
		) {
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				System.out.println("Received from client: " + inputLine);

				// Here, you can implement logic to handle client requests
				// For example, if the client sends a specific command, you can respond accordingly

				// Simulate sending stock updates to the client
				sendTcpStockUpdates(out);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void sendTcpStockUpdates(PrintWriter writer) {
		// Implement the logic to send periodic stock updates
		// This method can be called periodically to simulate real-time updates
		for (int i = 0; i < 5; i++) {
			// Send a new stock update to the client
			writer.println("Stock Update: " + i);

			try {
				Thread.sleep(1000); // Sleep for 1 second (simulating updates every second)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	static class StockExchangeServiceImpl extends StockExchangeServiceImplBase {
		private final ConcurrentHashMap<String, StockData> stockMap = new ConcurrentHashMap<String, StockData>();

		
		protected StockExchangeServiceImpl() {
			initUnos();
		}
		
		protected void initUnos() {
			for (StockData data: InitialData.loadStockData("C:\\Users\\mik\\Downloads\\STOCKMARKET2\\stock-market\\STOCKMARKET\\src\\main\\java\\rs\\raf\\pds\\v5\\z2\\nasdaq.csv")) {
				if (data != null) {
					stockMap.put(data.getSymbol(),data);
				} else {
					System.out.println("nema");
				}
			}

		}

		@Override
		public void getAllStockData(EmptyMessage request, StreamObserver<StockData> responseObserver) {
			System.out.println(stockMap.values());

			// Iterate through your data and send each StockData to the responseObserver
			for (StockData data : stockMap.values()) {
				if (data != null) {
					responseObserver.onNext(data);
				}
			}

			// Complete the stream
			responseObserver.onCompleted();
		}

}
}