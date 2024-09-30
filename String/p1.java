public class p1 {
    public static void main(String args[]){
    String s1="Sachin";
    String s2="Sachin";
    String s3=new String("Sachin");
    String s4="Saurav";

    String s5="SAURAV";
    

    //System.err.println(s1.equals(s2));
    //System.err.println(s1.equals(s3));
   // System.err.println(s1.equals(s4));

    //System.out.println(s4.equals(s5));
    //System.out.println(s4.equalsIgnoreCase(s5));

    //System.out.println(s1==s2);
    //System.out.println(s1==s3);

    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareTo(s4));

    System.out.println(s4.compareTo(s1));
}}
