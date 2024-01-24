package rs.raf.pds.v5.z2;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import rs.raf.pds.v5.z2.gRPC.*;
import rs.raf.pds.v5.z2.gRPC.StockExchangeServiceGrpc.StockExchangeServiceImplBase;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;



public class StockExchangeServiceServer {

	public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
          .forPort(8090)
          .addService(new StockExchangeServiceImpl()).build();

        server.start();
        server.awaitTermination();
    }
	
	static class StockExchangeServiceImpl extends StockExchangeServiceImplBase {
		private final ConcurrentHashMap<String, StockData> stockMap = new ConcurrentHashMap<String, StockData>();

		
		protected StockExchangeServiceImpl() {
			initUnos();
		}
		
		protected void initUnos() {
			for (StockData data: InitialData.loadStockData("C:\\Users\\Nikola\\Downloads\\STOCKMARKET\\STOCKMARKET\\src\\main\\java\\rs\\raf\\pds\\v5\\z2\\nasdaq.csv")) {
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