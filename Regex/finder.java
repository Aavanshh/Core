import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class finder {
    public static void main(String args[]){
        Scanner sc=new  Scanner(System.in);

        while(true){
            System.out.println("enter reger Pattern");
            Pattern pattern=Pattern.compile(sc.nextLine());

            System.out.println("enter Text :");
            Matcher matcher=pattern.matcher(sc.nextLine());


            boolean found=false;
            while(matcher.find()){
                System.out.println("I found the text"+matcher.group()+"starting index at"+matcher.start()+" ending index at "+matcher.end());
                found=true;
            }

            if(!found){
                System.out.println("no match found");
            }
        }

    }
}
