import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example1{
    public static void main(String[] args) {
        // LocalDate date=LocalDate.now();
        // LocalDate yesterday=date.minusDays(1);
        // LocalDate tomorrow=yesterday.plusDays(2);
        // LocalDate t1=date.plusDays(1);
        // System.out.println(date);
        // System.out.println(yesterday);
        // System.out.println(tomorrow);
        // System.out.println(t1);


        /************** ************/
        // LocalDate l1=LocalDate.of(2017, 06, 17);
        // System.out.println(l1.isLeapYear());
        // LocalDate l2=LocalDate.of(2016, 06, 17);
        // System.out.println(l2.isLeapYear());

        /************** ************/

        // LocalDate date=LocalDate.of(2017, 6, 17);
        // LocalDateTime time=date.atTime(1,50,9);
        // System.out.println(time);

        /************** ************/
        // LocalDate d1=LocalDate.now();
        // String s1=d1.format(DateTimeFormatter.ISO_DATE);
        // System.out.println(s1);

        // LocalDate d2=LocalDate.of(2002, 5, 17);
        // String s2=d2.format(DateTimeFormatter.ISO_DATE);
        // System.out.println(s2);

        // LocalDate d3=LocalDate.of(2006, 5, 17);
        // String s3=d3.format(DateTimeFormatter.ISO_DATE);
        // System.out.println(s3);


         /************** ************/


         String s1="2001-05-17";
         LocalDate d1=LocalDate.parse(s1);
         System.out.println(d1);








    }
}