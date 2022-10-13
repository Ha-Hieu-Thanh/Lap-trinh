package hust.soict.ictglobal.date;
import java.util.Calendar;
public class MyDate {
 private int day,month,year;
 private String sDay, sMonth, sYear;
 public void setCurrentDate() {
	 Calendar currentDay= Calendar.getInstance();
	 this.day= currentDay.get(Calendar.DATE);
	 this.month= currentDay.get(Calendar.MONTH)+1;
	 this.year= currentDay.get(Calendar.YEAR);
 }
public int getDay() {
	return day;
}

public void setDay(String sDay) {
	this.sDay = sDay;
}
public void setMonth(String sMonth) {
	this.sMonth = sMonth;
}
public void setYear(String sYear) {
	this.sYear = sYear;
}
public void setDay(int day) {
	if (1<=day&&day<=31)
	this.day = day;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	if (1<=month&&month<=12)
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public void setDate2(int day, int month, int year) {
	this.day = day;
	this.month = month;
	this.year = year;
}
 public void representDate() {
	 switch (this.month) {
	 case 1: System.out.print("January"); break;
	 case 2: System.out.print("February"); break;
	 case 3: System.out.print("March"); break;
	 case 4: System.out.print("April"); break;
	 case 5: System.out.print("May"); break;
	 case 6: System.out.print("June"); break;
	 case 7: System.out.print("July"); break;
	 case 8: System.out.print("August"); break;
	 case 9: System.out.print(":September"); break;
	 case 10: System.out.print("October"); break;
	 case 11: System.out.print("November"); break;
	 case 12: System.out.print("December"); break;
	 }
	 System.out.print(this.day+" "+this.year);
 }
 public void accept(String dates) {
	 this.day=Integer.parseInt(dates.split("-")[0]);
	 this.month=Integer.parseInt(dates.split("-")[1]);
	 this.year=Integer.parseInt(dates.split("-")[2]);
 }
 public void print() {
	 System.out.println("The current date: "+this.day+"-"+this.month+"-"+this.year);
 }
 public void print(int a) {
	 System.out.println("\nThe curent date: " + this.sDay + " - " + this.sMonth +" - "+this.sYear);
 }
	
}
