import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Calendar;

public class ExampleUtilDate2 {
    public static void main(String[] args) {
        // String str="2015-03-31";
        // Date date=Date.valueOf(str);System.out.println(date);
    
        // Date d=new Date();
        // System.out.println(d);
        // d.setTime(10000000);
        // System.out.println(d);

        // LocalDateTime l1=LocalDateTime.now();
        // System.out.println(l1.toLocalDate());

        Calendar cn=Calendar.getInstance();
        cn.set(Calendar.MONTH,07);
        cn.set(Calendar.DATE,12);
        cn.set(Calendar.YEAR,2021);

        Date d=cn.getTime();
        Instant instant=d.toInstant();
        System.out.println(d.toString());
        System.out.println(instant);
    }
}
