import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class Example13 {

    public static void main(String[] args) {
        // Period p1=Period.ofDays(24);
        // Temporal temp=p1.addTo(LocalDate.now());
        // System.out.println(temp);

        // Period p1=Period.of(2017, 02, 16);
        // System.out.println(p1.toString());

        // Period p1=Period.ofMonths(4);
        // Period p2=p1.minus(Period.ofMonths(2));
        // System.out.println(p2);

        Period p1=Period.ofMonths(4);
        Period p2=p1.plus(Period.ofMonths(2));
        System.out.println(p2);
    }
    
}
