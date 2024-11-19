import java.util.regex.Pattern;

public class quantifiers {

    public static void main(String args[]){

        System.out.println("? Quantifiers.....");
        System.out.println(Pattern.matches("[amn]?","aaa"));
        System.out.println(Pattern.matches("[amn]?","aammmnn"));
        System.out.println(Pattern.matches("[amn]?","aazzta"));
        System.out.println(Pattern.matches("[amn]?","a"));

        System.out.println("+ Quantifiers.....");
        System.out.println(Pattern.matches("[amn]+","a"));
        System.out.println(Pattern.matches("[amn]+","aaa"));
        System.out.println(Pattern.matches("[amn]+","aammmnn"));
        System.out.println(Pattern.matches("[amn]+","aazzta"));

        System.out.println("* Quantifiers.....");
        System.out.println(Pattern.matches("[amn]*","ammmna"));


    }
    
}
