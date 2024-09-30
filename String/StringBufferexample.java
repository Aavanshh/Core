public class StringBufferexample {
    public static void main(String args[]){

        StringBuffer sb=new StringBuffer("hello");
        //sb.append(" Kashyap");
        //System.out.println(sb);

        //sb.insert(1, "rishabh");
        //System.out.println(sb);

        //sb.replace(1,3 , "Rishu");System.out.println(sb);

        //sb.delete(1, 3);
       // System.out.println(sb);

       //sb.reverse();
       //System.out.println(sb);

       StringBuffer sb1=new StringBuffer();
       System.out.println(sb1.capacity());

       sb1.append("hello");
       System.out.println(sb1.capacity());

       sb1.append("my name is rishabh kashyap");
       System.out.println(sb1.capacity());

       sb1.ensureCapacity(10);
       System.out.println(sb1.capacity());

       sb1.ensureCapacity(50);
       System.out.println(sb1.capacity());
    }
}
