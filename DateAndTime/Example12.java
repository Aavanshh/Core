import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoField;

public class Example12 {
    public static void main(String[] args) {
        // YearMonth y1=YearMonth.now();
        // System.out.println(y1);

        // long l1=y1.get(ChronoField.YEAR);
        // System.out.println(l1);
        // long l2=y1.get(ChronoField.MONTH_OF_YEAR);
        // System.out.println(l2);

        // YearMonth ym1=YearMonth.now();
        // YearMonth ym2=ym1.plus(Period.ofYears(2));
        // System.out.println(ym2);

        YearMonth ym1=YearMonth.now();
        YearMonth ym2=ym1.minus(Period.ofYears(2));
        System.out.println(ym2);
    }
}
