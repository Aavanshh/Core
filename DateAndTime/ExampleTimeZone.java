import java.util.Calendar;
import java.util.TimeZone;

public class ExampleTimeZone {

    public static void main(String[] args) {
        // String[] id=TimeZone.getAvailableIDs();
        // for(int i=0;i<id.length;i++){
        //     System.out.println(id[i]);
        // }

        // TimeZone zone=TimeZone.getTimeZone("Asia/Kolkata");
        // System.out.println(zone.getOffset(Calendar.ZONE_OFFSET));

        // System.out.println(zone.getID());

        TimeZone zone=TimeZone.getDefault();
        // String name=zone.getDisplayName();
        // System.out.println(name);
        // System.out.println(zone.getID());
        zone.setID("GMT+07:01");
        System.out.println(zone.getID());
    }
    
}
