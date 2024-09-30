import java.util.ArrayList;

public class equalsIgnoreCase {
    public static void main(String args[]){
        // String s1="javatpoint";
        // String s2="javatpoint";
        // String s3="JAVATPOINT";
        // String s4="Rishu";

        // System.out.println(s1.equalsIgnoreCase(s2));
        // System.out.println(s1.equalsIgnoreCase(s3));
        // System.out.println(s1.equalsIgnoreCase(s4));

        String str1="Mukesh Kumar";

        ArrayList<String> list=new ArrayList<>();

        list.add("Mohan");
        list.add("Mukesh");
        list.add("Ravi");
        list.add("MuKesH KuMar");
        list.add("Suresh");

        for(String str:list){
            if(str.equalsIgnoreCase(str1)){
                System.out.println("Mukesh Kumar is present");
            }
        }
    }
}
