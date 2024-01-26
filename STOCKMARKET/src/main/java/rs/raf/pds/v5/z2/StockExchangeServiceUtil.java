package rs.raf.pds.v5.z2;

import com.google.protobuf.Timestamp;

import java.util.Date;

public class StockExchangeServiceUtil {
	public static Date timestampToDate(Timestamp t) {
		return new Date(t.getSeconds() * 1000);
	}
}
