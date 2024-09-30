public class p4 {
    
    public static String  concatwithString(){
        String t="java";
        for(int i=0;i<10000;i++){
            t=t+"Rishabh";
        }
        return t;
    }

    public static String concatwithStringBuffer(){
        StringBuffer sb=new StringBuffer("java");

        for(int i=0;i<10000;i++){
            sb.append("Rishabh");
        }
        return sb.toString();
    }


    public static void main(String args[]){
        //long startTime=System.currentTimeMillis();
       // concatwithString();
       // System.out.println("Time taken by function one :"+(System.currentTimeMillis()-startTime)+"ms");

        //startTime=System.currentTimeMillis();
        //concatwithStringBuffer();
        //System.out.println("Time taken by function 2 :"+(System.currentTimeMillis()-startTime)+"ms");
            String str="rishabh";
            System.out.println(str.hashCode());
            str=str+" kashyap";
            System.out.println(str.hashCode());

            System.out.println("*****************");
            StringBuffer sb1=new StringBuffer("Rishabh");
            System.out.println(sb1.hashCode());
            sb1.append(" Kashyap");
            System.out.println(sb1.hashCode());
    }
}
