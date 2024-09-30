import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ExampleCurrDate{
    public static void main(String[] args) {
        DateTimeFormatter d=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now =LocalDateTime.now();
        System.out.println(now);

        SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dt=new Date();
        System.out.println(s.format(dt));

        System.out.println(java.time.LocalDate.now());
        System.out.println(java.time.LocalTime.now());
        System.out.println(java.time.LocalDateTime.now());
        System.out.println(java.time.Clock.systemUTC());

        java.util.Date date=new java.util.Date();
        System.out.println(date);

        long millis=System.currentTimeMillis();
        java.util.Date date1=new java.util.Date(millis);
        System.out.println(date);

        java.sql.Date date2=new java.sql.Date(millis);
        System.out.println(date2);


    }
}