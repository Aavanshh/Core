import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example8 {
public static void main(String[] args) {
    // ZonedDateTime zone=ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");
    // System.out.println(zone);

    // LocalDateTime ldt=LocalDateTime.of(2017, Month.JANUARY, 19, 15, 26 );
    // ZoneId india=ZoneId.of("Asia/Kolkata");
    // ZonedDateTime zone1=ZonedDateTime.of(ldt,india);
    // System.out.println(zone1);

    // ZoneId tokyo =ZoneId.of("Asia/Tokyo");
    // ZonedDateTime zone2=zone1.withZoneSameInstant(tokyo);
    // System.out.println(zone2);

    // ZonedDateTime zone=ZonedDateTime.now();
    // System.out.println(zone.getZone());

    // ZonedDateTime zone3=ZonedDateTime.now();
    // ZonedDateTime m=zone3.minus(Period.ofDays(126));
    // System.out.println(m);

     ZonedDateTime zone4=ZonedDateTime.now();
    ZonedDateTime m=zone4.plus(Period.ofDays(126));
    System.out.println(m);
}
    
}
