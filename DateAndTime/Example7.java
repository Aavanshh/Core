import java.time.Clock;
import java.time.Duration;

public class Example7 {

    public static void main(String[] args) {
       Clock c=Clock.systemDefaultZone();
       System.out.println(c); 

       Clock c1=Clock.systemUTC();
       System.out.println(c1.instant());

       Duration d=Duration.ofHours(5);
       Clock clock=Clock.offset(c1, d);
       System.out.println(clock.instant());
    }
    
}
