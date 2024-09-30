import java.util.*;
public class P3 {

    public static void main(String args[]){

        String s ="Rishabh KAshyap";
        //System.out.println("Original String"+s);
       // System.out.println("sub-String"+s.substring(6));
       // System.out.println("sub-String"+s.substring(0,11));

        String text=new String("Hello , My name is Rishabh");

        String[] sentences=text.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
    
}
