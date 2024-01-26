package rs.raf.pds.v5.z2;

import com.google.protobuf.Timestamp;
import rs.raf.pds.v5.z2.gRPC.StockData;
import rs.raf.pds.v5.z2.gRPC.StockRequest;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import javax.xml.crypto.Data;

public class InitialData {

	public static List<StockData> loadStockData(String filePath) {
		List<StockData> stocks = new ArrayList<>();
		try (CSVParser parser = new CSVParser(new FileReader(filePath), CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
			for (CSVRecord record : parser) {
				String symbol = record.get("Symbol");
				String companyName = record.get("Name");
				double startPrice = Double.parseDouble(record.get("Last Sale").substring(1));
				double change = Double.parseDouble(record.get("Net Change"));

				Instant instant = Instant.now();
				//final Instant instant = java.sql.Timestamp.valueOf(localDate.atStartOfDay()).toInstant();
				Timestamp t = Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).build();
				Date date = new Date(t.getSeconds() * 1000);

				System.out.println(symbol + " " + companyName  +" " + startPrice +" " + change +" " + date);

				StockData stockData = StockData.newBuilder()
						.setSymbol(symbol)
						.setCompanyName(companyName)
						.setPriceAtStart(startPrice)
						.setPriceChange(change)
						.setDate(t)  // Use the current time
						.build();

				stocks.add(stockData);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return stocks;
	}
}