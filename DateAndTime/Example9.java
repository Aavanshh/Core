import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class Example9 {
   public static void main(String[] args) {
    // ZoneId z1=ZoneId.of("Asia/Kolkata");
    // ZoneId z2=ZoneId.of("Asia/Tokyo");

    // LocalTime l1=LocalTime.now(z1);
    // LocalTime l2=LocalTime.now(z2);

    // System.out.println(l1);
    // System.out.println(l2);
    // System.out.println(l1.isBefore(l2));

    // ZoneId zone=ZoneId.systemDefault();
    // System.out.println(zone);

    // ZoneId z=ZoneId.systemDefault();
    // String s=z.getId();
    // System.out.println(s);

    ZoneId z=ZoneId.systemDefault();
    System.out.println(z.getDisplayName(TextStyle.FULL, Locale.ROOT));

   } 
}
