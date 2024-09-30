import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Example3 {

    public static void main(String[] args) {
        ZoneId z1=ZoneId.of("Asia/Kolkata");
        ZoneId z2=ZoneId.of("Asia/Tokyo");

        LocalTime l1=LocalTime.now(z1);
        System.out.println(l1);

        LocalTime l2=LocalTime.now(z2);
        System.out.println(l2);

        long hours=ChronoUnit.HOURS.between(l1, l2);
        System.out.println(hours);

        long minutes=ChronoUnit.MINUTES.between(l1, l2);
        System.out.println(minutes);
    }
}