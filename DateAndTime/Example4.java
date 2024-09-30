import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Example4 {
    public static void main(String[] args) {
        // LocalDateTime now=LocalDateTime.now();
        // System.out.println(now);

        // DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        // String formatteddate=now.format(format);
        // System.out.println(formatteddate);

        // LocalDateTime l1=LocalDateTime.now();
        // DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH/mm/ss");
        // String formatteddate=l1.format(format);
        // System.out.println(formatteddate);

    //     LocalDateTime a=LocalDateTime.of(27, 6, 13, 13, 15, 56);
    //     System.out.println(a.get(ChronoField.DAY_OF_WEEK));
    //     System.out.println(a.get(ChronoField.DAY_OF_YEAR));
    //     System.out.println(a.get(ChronoField.DAY_OF_MONTH));
    //     System.out.println(a.get(ChronoField.HOUR_OF_DAY));
    //     System.out.println(a.get(ChronoField.MINUTE_OF_DAY));
    // 
    
    // LocalDateTime a1=LocalDateTime.of(2007, 6, 13, 13, 15, 56);
    // LocalDateTime a2=a1.minusDays(100);
    // System.out.println(a2);

    // DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    // String Formatteddate=a2.format(format);
    // System.out.println(Formatteddate);

    LocalDateTime a1=LocalDateTime.of(2007, 6, 13, 13, 15, 56);
    LocalDateTime a2=a1.plusDays(100);
    System.out.println(a2);

    DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String Formatteddate=a2.format(format);
    System.out.println(Formatteddate);
}
    
}
