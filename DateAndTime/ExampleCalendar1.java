import java.util.Calendar;

public class ExampleCalendar1 {
   public static void main(String[] args) {
    // Calendar calendar=Calendar.getInstance();
    // System.out.println(calendar.getTime());
    // calendar.add(Calendar.DATE, -15);
    // System.out.println(calendar.getTime());
    // calendar.add(Calendar.MONTH, 4);
    // System.out.println(calendar.getTime());
    // calendar.add(Calendar.YEAR, 2);
    // System.out.println(calendar.getTime());

    Calendar calendar=Calendar.getInstance();
    // System.out.println(calendar.get(Calendar.YEAR));
    // System.out.println(calendar.get(Calendar.DATE));

    // System.out.println(calendar.getTime());

    // int maximum=calendar.getMaximum(Calendar.DAY_OF_WEEK);
    // System.out.println(maximum);
    // maximum=calendar.getMaximum(Calendar.WEEK_OF_YEAR);
    // System.out.println(maximum);

    int Minimum=calendar.getMinimum(Calendar.DAY_OF_WEEK);
    System.out.println(Minimum);
    Minimum=calendar.getMinimum(Calendar.WEEK_OF_YEAR);
    System.out.println(Minimum);
   } 
}
