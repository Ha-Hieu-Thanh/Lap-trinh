package hust.soict.ictglobal.date;
import java.text.ParseException;

public class DateTest {
	public static void main(String[] args) throws ParseException {
		MyDate mydate = new MyDate();
		mydate.setCurrentDate();
		mydate.print();
		mydate.setDate2(12,07,2003);
		mydate.print();
		mydate.accept("15-12-2002");
		mydate.print();
		mydate.representDate();
		
		MyDate mydate1 = new MyDate();
		mydate1.setDay("second");
		mydate1.setMonth("September");
		mydate1.setYear("twenty fortyfive");
		mydate1.print(1);
		
		/*MyDate mydate2 = new MyDate();
		MyDate mydate3 = new MyDate();
		MyDate mydate4 = new MyDate();
		MyDate mydate5 = new MyDate();
		MyDate mydate6 = new MyDate();
		mydate2.accept("12-07-2003");
		mydate3.accept("24-03-2008");
		mydate4.accept("28-10-1976");
		mydate5.accept("02-07-1974");
		mydate6.setCurrentDate();
		DateUtils.sortingANumberOfDates(mydate, mydate2, mydate3,mydate4,mydate5,mydate6);
		*/
	}
}
