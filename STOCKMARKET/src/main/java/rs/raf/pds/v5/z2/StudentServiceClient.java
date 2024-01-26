package rs.raf.pds.v5.z2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Iterator;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import rs.raf.pds.v5.z2.gRPC.*;


public class StudentServiceClient {
	
	public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090)
          .usePlaintext()
          .build();

        StockExchangeServiceGrpc.StockExchangeServiceStub asyncStub = StockExchangeServiceGrpc.newStub(channel);
		StockExchangeServiceGrpc.StockExchangeServiceBlockingStub blockingStub = StockExchangeServiceGrpc.newBlockingStub(channel);

// Make the gRPC call
		Iterator<StockData> dataIterator = blockingStub.getAllStockData(EmptyMessage.newBuilder().build());

        // Server Streaming gRPC method invitation
        System.out.println("Stock Market");
		int count = 0;
		while (count < 10) {
			StockData stockData = dataIterator.next();
			System.out.println("Симбол: " + stockData.getSymbol());
			System.out.println("Назив компаније: " + stockData.getCompanyName());
			System.out.println("Цена (на почетку дана): " + stockData.getPriceAtStart());
			System.out.println("Промена (у односу на почетак дана): " + stockData.getPriceChange());
			System.out.println("Датум: " + StockExchangeServiceUtil.timestampToDate(stockData.getDate()));
			count++;
		}
	}
	private static void makeSocketCall() {
		try (Socket socket = new Socket("localhost", 7999);
			 PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
			 BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

			// Send a message to the server
			//writer.println("update");

			try (
					BufferedReader stdIn = new BufferedReader(
							new InputStreamReader(System.in))    // Za čitanje sa standardnog ulaza - tastature!
			) {

				String userInput;
				boolean running = true;

				while (running) {
					userInput = stdIn.readLine();
					if (userInput == null || "BYE".equalsIgnoreCase(userInput)) // userInput - tekst koji je unet sa tastature!
					{
						running = false;
					} else if (userInput.startsWith("track")) {
						String[] parts = userInput.split(" ", 2);
						if (parts.length == 2) {
							String track = parts[0];
							String symbol = parts[1];
							String saljem = track + " " + symbol;
							writer.println(saljem);


						}
					}
				}

				// Read the server's response
				String serverResponse;
				while ((serverResponse = reader.readLine()) != null) {
					System.out.println("server kaze: " + serverResponse);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
