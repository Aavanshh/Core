import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class ExampleSDF1 {
    public static void main(String[] args) {
        // Date date=new Date();
        // System.out.println(date);
        // String str=DateFormat.getInstance().format(date);
        // System.out.println(str);
        
        // str=DateFormat.getDateInstance().format(date);
        // System.out.println(str);

        // str=DateFormat.getTimeInstance().format(date);
        // System.out.println(str);

        // str=DateFormat.getDateTimeInstance().format(date);
        // System.out.println(str);
        
        // str=DateFormat.getTimeInstance(DateFormat.SHORT).format(date);
        // System.out.println(str);

        // str=DateFormat.getTimeInstance(DateFormat.MEDIUM).format(date);
        // System.out.println(str);

        // str=DateFormat.getTimeInstance(DateFormat.SHORT).format(date);
        // System.out.println(str);

        // str=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(date);
        // System.out.println(str);

        // Date d=DateFormat.getDateInstance().parse("31 Mar,2024");
        // System.out.println(d);

        // Locale l=Locale.FRENCH;

        // Date d=new Date();
        // DateFormat dFormat=DateFormat.getTimeInstance(DateFormat.SHORT,l);
        // String str=dFormat.format(d);
        // System.out.println(str);

        // Locale l=Locale.FRENCH;
        // Date d=new Date();
        // DateFormat dFormat=DateFormat.getDateInstance(DateFormat.SHORT,l);
        // String str=dFormat.format(d);
        // System.out.println(str); 

        // Locale l=Locale.FRENCH;
        // Date d=new Date();
        // DateFormat dFormat=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG,l);
        // String str=dFormat.format(d);
        // System.out.println(str); 

        // DateFormat d=DateFormat.getDateTimeInstance();
        // System.out.println(d.getCalendar());

        DateFormat d=DateFormat.getTimeInstance(DateFormat.SHORT);
        NumberFormat n=d.getNumberFormat();
        System.out.println(n);
    }
}
