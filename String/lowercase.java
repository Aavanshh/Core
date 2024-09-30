import java.util.Locale;

public class lowercase {
    public static void main(String args[]){
        String s1="JAVATPOINT HELLOI stRiNg";
        String s1lower=s1.toLowerCase();
        System.out.println(s1lower);

        String eng=s1.toLowerCase(Locale.ENGLISH);
        System.out.println(eng);

        String turkish=s1.toLowerCase(Locale.forLanguageTag("tr"));
        System.out.println(turkish);
    }
}
