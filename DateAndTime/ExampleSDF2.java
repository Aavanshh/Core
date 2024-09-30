import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExampleSDF2 {
    public static void main(String[] args) {
    //     Date d=new Date();
    //     SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
    //     String str=f.format(d);
    //     System.out.println(str);

    //      f=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
    //      str=f.format(d);
    //     System.out.println(str);

    //     f=new SimpleDateFormat("dd MMMM yyyy ");
    //      str=f.format(d);
    //     System.out.println(str);

    //     f=new SimpleDateFormat("dd MMMM yyyy zzzz");
    //     str=f.format(d);
    //    System.out.println(str);

    //    f=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss z");
    //      str=f.format(d);
    //     System.out.println(str);

        SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
        // try{
        //     Date d=s.parse("31/03/2025");
        //     System.out.println(d);
        // }catch(Exception e){}

        // try{
        //     Calendar cl=Calendar.getInstance();
        //     cl.setTime(s.parse("11/12/24"));
        //     System.out.println(cl.getTime());
        //     s.set2DigitYearStart(s.parse("02/02/2000"));
        //     System.out.println(cl.getTime());
        //     // cl.setTime(s.parse("02/02/15"));
        //     cl.setTime(s.get2DigitYearStart());
        //     System.out.println(cl.get(Calendar.YEAR));
        // }catch(Exception e){}

        Calendar c=Calendar.getInstance();
        String curdate=s.format(c.getTime());
        System.out.println(curdate);
        System.out.println(s.toPattern());

    }
    
}
