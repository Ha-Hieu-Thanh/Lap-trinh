package hust.soict.ictglobal.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Arrays;
public class DateUtils {
	public static void compare2Dates(MyDate d1, MyDate d2) throws ParseException {
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
	      Date date1 = sdformat.parse(d1.getYear()+"-"+d1.getMonth()+"-"+d1.getDay());
	      Date date2 = sdformat.parse(d2.getYear()+"-"+d2.getMonth()+"-"+d2.getDay());
	      if(date1.compareTo(date2) > 0) {
	          System.out.println("Date 1 occurs after Date 2");
	       } else if(date1.compareTo(date2) < 0) {
	          System.out.println("Date 1 occurs before Date 2");
	       } else if(date1.compareTo(date2) == 0) {
	          System.out.println("Both dates are equal");
	       }
	    }
/*	public static void sortingANumberOfDates(MyDate...dates ) throws ParseException {
		int numberOfDates = dates.length;
		Date[] Dates = new Date[10];
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
		for (int i=0;i<numberOfDates;i++) {
			Dates[i] = sdformat.parse(dates[i].getYear()+"-"+dates[i].getMonth()+"-"+dates[i].getDay());
		}
		Arrays.sort(Dates);
		for (int i=0;i<numberOfDates;i++) {
			System.out.println(sdformat.format(Dates[i]));
		}
	}*/
}

