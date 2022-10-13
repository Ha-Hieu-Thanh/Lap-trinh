import java.sql.Date;
import java.text.SimpleDateFormat;

public class MyDate {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
    }
}
