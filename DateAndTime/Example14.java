import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Example14 {
    public static void main(String[] args) {
        // Duration d=Duration.between(LocalTime.NOON, LocalTime.MAX);
        // System.out.println(d.get(ChronoUnit.SECONDS));

        // Duration d1=Duration.between(LocalTime.MAX, LocalTime.NOON);
        // System.out.println(d1.isNegative());

        // Duration d2=Duration.between(LocalTime.NOON, LocalTime.MAX);
        // System.out.println(d2.isNegative()); 

        // Duration d3=Duration.between(LocalTime.NOON, LocalTime.MAX);
        // System.out.println(d3.getSeconds());

        // Duration d4=d3.minus(d3);
        // System.out.println(d4.getSeconds());

        Duration d5=Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println(d5.getSeconds());

        Duration d6=d5.plus(d5);
        System.out.println(d6.getSeconds());
    
    }
}
