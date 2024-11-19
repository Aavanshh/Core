import java.util.regex.Pattern;

public class example4 {

    public static void main(String args[]){

System.out.println("Meta characters d.....");

System.out.println(Pattern.matches("\\d","abc"));
System.out.println(Pattern.matches("\\d","1"));
System.out.println(Pattern.matches("\\d","443"));
System.out.println(Pattern.matches("\\d","332abc"));

System.out.println("Meta characters D.....");

System.out.println(Pattern.matches("\\D","abc"));
System.out.println(Pattern.matches("\\D","1"));
System.out.println(Pattern.matches("\\D","443"));
System.out.println(Pattern.matches("\\D","332abc"));
System.out.println(Pattern.matches("\\D","m"));

System.out.println("Meta characters D.....");

System.out.println(Pattern.matches("\\D*","abc"));

    }
    
}
