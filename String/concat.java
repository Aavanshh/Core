public class concat {
    public static void main(String args[]){
        // String s1="java String";

        // s1.concat("is immutable");

        // System.out.println(s1);
        // s1=s1.concat(" is rishabh");
        // System.out.println(s1);

        String str1="Rishabh";
        String str2="Javatpoint";
        String str3="Reader";

        String str4=str1.concat(str2);
        System.out.println(str4);
        String str5=str1.concat(str2).concat(str3);
        System.out.println(str5);

        String str6=str1.concat(" ").concat(str2).concat(" ").concat(str3);
        System.out.println(str6);

        String str7=str1.concat("!!!!!");
        System.out.println(str7);

        String str8=str1.concat(" @").concat(str2);
        System.out.println(str8);

        String str9="Rishabh is ";
        String str10="Hello guys ".concat(str9).concat(" the best");
        System.out.println(str10);
    }
}
