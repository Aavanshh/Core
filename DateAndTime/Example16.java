import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Example16 {
    public static void main(String[] args) {
        // Instant inst=Instant.parse("2017-02-03T10:37:30.00Z");
        // System.out.println(inst);

        // Instant i1=Instant.now();
        // System.out.println(i1);

//         Instant inst2=Instant.parse("2017-02-03T10:37:30.00Z");
// inst2=inst2.minus(Duration.ofDays(125));
// System.out.println(inst2);

// Instant inst2=Instant.parse("2017-02-03T10:37:30.00Z");
// inst2=inst2.plus(Duration.ofDays(125));
// System.out.println(inst2);

Instant inst2=Instant.parse("2017-02-03T10:37:30.00Z");
System.out.println(inst2.isSupported(ChronoUnit.DAYS));
System.out.println(inst2.isSupported(ChronoUnit.YEARS));



    }
}
