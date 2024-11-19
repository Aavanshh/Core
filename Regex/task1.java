import java.util.regex.Pattern;

public class task1 {

    public static void main(String args[]){
        System.out.println(Pattern.matches("[a-zA-Z0-9]", "arun32"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JATUK2"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]", "arun$2"));

        System.out.println("by character class and quantifiers");

        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "99530389491"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "6530389492"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "8253038949"));

        System.out.println("by metacharacter ");

        System.out.println(Pattern.matches("[789]{1}\\d{9}", "9953038949"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "3553038949"));
    }
    
}
