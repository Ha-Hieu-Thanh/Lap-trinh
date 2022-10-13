import java.util.Scanner;

public class DisplayNumberOfDaysOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Year = ");
        int year = sc.nextInt();
        while (year <= 0) {
            System.out.print("Year = ");
            year = sc.nextInt();
        }
        String month;
        boolean kiemtra = false;
        while (!kiemtra) {
            kiemtra = true;
            System.out.print("Month = ");
            month = sc.next();
            if ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0)) {
                switch (month) {
                    case "January":
                    case "Jan.":
                    case "Jan":
                    case "1":
                        System.out.println("31");
                        break;
                    case "February":
                    case "Feb.":
                    case "Feb":
                    case "2":
                        System.out.println("28");
                        break;
                    case "March":
                    case "Mar.":
                    case "Mar":
                    case "3":
                        System.out.println("31");
                        break;
                    case "April":
                    case "Apr.":
                    case "Arp":
                    case "4":
                        System.out.println("30");
                        break;
                    case "May":
                    case "5":
                        System.out.println("31");
                        break;
                    case "June":
                    case "Jun":
                    case "6":
                        System.out.println("30");
                        break;
                    case "July":
                    case "Jul":
                    case "7":
                        System.out.println("31");
                        break;
                    case "August":
                    case "Aug.":
                    case "Aug":
                    case "8":
                        System.out.println("31");
                        break;
                    case "September":
                    case "Sept.":
                    case "Sep":
                    case "9":
                        System.out.println("30");
                        break;
                    case "October":
                    case "Oct.":
                    case "Oct":
                    case "10":
                        System.out.println("31");
                        break;
                    case "November":
                    case "Nov.":
                    case "Nov":
                    case "11":
                        System.out.println("30");
                        break;
                    case "December":
                    case "Dec.":
                    case "Dec":
                    case "12":
                        System.out.println("31");
                        break;
                    default:
                        kiemtra = false;
                }
            } else {
                switch (month) {
                    case "January":
                    case "Jan.":
                    case "Jan":
                    case "1":
                        System.out.println("31");
                        break;
                    case "February":
                    case "Feb.":
                    case "Feb":
                    case "2":
                        System.out.println("28");
                        break;
                    case "March":
                    case "Mar.":
                    case "Mar":
                    case "3":
                        System.out.println("31");
                        break;
                    case "April":
                    case "Apr.":
                    case "Arp":
                    case "4":
                        System.out.println("30");
                        break;
                    case "May":
                    case "5":
                        System.out.println("31");
                        break;
                    case "June":
                    case "Jun":
                    case "6":
                        System.out.println("30");
                        break;
                    case "July":
                    case "Jul":
                    case "7":
                        System.out.println("31");
                        break;
                    case "August":
                    case "Aug.":
                    case "Aug":
                    case "8":
                        System.out.println("31");
                        break;
                    case "September":
                    case "Sept.":
                    case "Sep":
                    case "9":
                        System.out.println("30");
                        break;
                    case "October":
                    case "Oct.":
                    case "Oct":
                    case "10":
                        System.out.println("31");
                        break;
                    case "November":
                    case "Nov.":
                    case "Nov":
                    case "11":
                        System.out.println("30");
                        break;
                    case "December":
                    case "Dec.":
                    case "Dec":
                    case "12":
                        System.out.println("31");
                        break;
                    default:
                        kiemtra = false;
                }
            }
        }
    }
}
