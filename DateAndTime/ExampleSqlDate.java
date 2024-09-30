import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;

public class ExampleSqlDate{
    public static void main(String[] args) {
        // long millis=System.currentTimeMillis();
        // java.sql.Date date =new java.sql.Date(millis);
        // System.out.println(date);

        // String str="2015-03-31";
        // Date date=Date.valueOf(str);
        // System.out.println(date);

        // Date d=new Date();
        // System.out.println(d);
        // d.setTime(10000000);
        // System.out.println(d);

        // LocalDateTime l1=LocalDateTime.now();
        // System.out.println(l1.toLocalDate());

        Calendar ch=Calendar.getInstance();
        ch.set(Calendar.MONTH, 12);
        ch.set(Calendar.YEAR, 2024);
        java.util.Date d=(java.util.Date)ch.getTime();
        Instant inst=d.toInstant();
        System.out.println(d.toString());
        System.out.println(inst);
    }
} 