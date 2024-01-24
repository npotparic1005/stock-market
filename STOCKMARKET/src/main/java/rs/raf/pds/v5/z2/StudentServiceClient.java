package rs.raf.pds.v5.z2;

import java.util.Iterator;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import rs.raf.pds.v5.z2.gRPC.*;
import io.grpc.stub.StreamObserver;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


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
			System.out.println("Датум: " + stockData.getDate());
			count++;
		}

	}
}
