import java.util.Locale;

public class uppercase {

    public static void main(String args[]){
        String s1="hello rishabh";
        String s1upper=s1.toUpperCase();
        System.out.println(s1upper);

        String turkish=s1.toUpperCase(Locale.forLanguageTag("tr"));
        String eng=s1.toUpperCase(Locale.forLanguageTag("en"));

        System.out.println(turkish);
        System.out.println(eng);
    }
    
}
