public class intern {
    public static void main(String args[]){
        // String s1=new String("hello");
        // String s2="hello";
        // String s3=s1.intern();

        // System.out.println(s1==s2);
        // System.out.println(s2==s3);

        String s1="Rishabh";
        String s2=s1.intern();
        String s3=new String("Rishabh");
        String s4=s3.intern();

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s3==s4);
    }
}
