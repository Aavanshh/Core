import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class Example5 {
    public static void main(String[] args) {
      MonthDay month=MonthDay.now();
    //   LocalDate date=month.atYear(1997);
    //   System.out.println(date);
      
    //   boolean b=month.isValidYear(2012);
    //   System.out.println(b);

    //   long n=month.get(ChronoField.MONTH_OF_YEAR);
    //   System.out.println(n);

    ValueRange r1=month.range(ChronoField.MONTH_OF_YEAR);
    System.out.println(r1);

    ValueRange r2=month.range(ChronoField.DAY_OF_MONTH);
    System.out.println(r2);
    }
}
