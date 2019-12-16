package kyna.vn.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	public static Date fromString(String d) {
		try {
			Date date =sdf.parse(d);
			return date;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String fromDate(Date d) {
		return sdf.format(d);
	}
}
