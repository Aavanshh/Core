import java.util.ArrayList;

public class equals {
    public static void main(String args[]){
        String s1="Rishabh";
        String s2="rishabh";
        String s3="rishu";
        String s4="RISHABH";
        String s5="Rishabh";

        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s5));
        // System.out.println(s1.equals(s3));
        // System.out.println(s1.equals(s4));

        // if(s1.equals(s5)){
        //     System.out.println("inside if block");
        // }else{
        //     System.out.println("else block");
        // }

        // String str1="rishabh";

        // ArrayList <String> list=new ArrayList<>();

        // list.add("rishu");
        // list.add("rishabh");
        // list.add("rahul");

        // for(String str:list){
        //     if(str.equals(str1)){
        //         System.out.println("Rishabh is present");
        //     }
        // }

        String str="a";
        String str1="123";
        String str2="45.89";
        String str3="false";
        Character c= new Character('a');
        Integer i=new Integer(123);
        Float f=new Float(45.89);
        Boolean b=new Boolean(false);

        System.out.println(str.equals(c));
        System.out.println(str1.equals(i));
        System.out.println(str2.equals(f));
        System.out.println(str3.equals(b));

        System.out.println(str.equals(c.toString()));
        System.out.println(str1.equals(i.toString()));
        System.out.println(str2.equals(f.toString()));
        System.out.println(str3.equals(b.toString()));
    }
}
