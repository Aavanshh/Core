import java.io.UnsupportedEncodingException;

public class getbytes {
    public static void main(String args[]){
        // String s1="ABCDEFG";

        // byte[] barr=s1.getBytes();

        // for(int i=0;i<barr.length;i++){
        //     System.out.println(barr[i]);
            
        // }

        // String s2=new String(barr);
        // System.out.println(s2);


        // String str="Welcome to javatpoint";
        // System.out.println("the input String is : ");
        // System.out.println(str+"\n");


        // try{
        //     //16-bitUCSTransformationformat 
        //     byte[] bytearr=str.getBytes("UTF-16");
        //     System.out.println("after converted into utf-16 the string is :");
        //     for(int j=0;j<bytearr.length;j++){
        //         System.out.println(bytearr[j]);
        //     }
        //     System.out.println("\n");
        //     System.out.println("*****************************************");

        //     //Big endian byte order, 16-bitUCSTransformationformat

        //     byte[] bytearr1=str.getBytes("UTF-16BE");
        //     System.out.println("after converted into utf-16BE the string is :");
        //     for(int j=0;j<bytearr1.length;j++){
        //         System.out.println(bytearr1[j]);
        //     }
        //     System.out.println("\n");
        //     System.out.println("*****************************************");

        //     //ISO Latin Alphabet

        //     byte[] bytearr2=str.getBytes("ISO-8859-1");
        //     System.out.println("after converted into ISO-8859-1 the string is :");
        //     for(int j=0;j<bytearr2.length;j++){
        //         System.out.println(bytearr2[j]);
        //     }
        //     System.out.println("\n");
        //     System.out.println("*****************************************");

        //     //Little Endian byte order, 16 - bit UCS Transformation format

        //     byte[] bytearr3=str.getBytes("UTF-16LE");
        //     System.out.println("after converted into ISO-8859-1 the string is :");
        //     for(int j=0;j<bytearr3.length;j++){
        //         System.out.println(bytearr3[j]);
        //     }
        //     System.out.println("\n");
        //     System.out.println("*****************************************");


        // }catch(UnsupportedEncodingException g){
        //     System.out.println("Exception is : "+g);
        // }


        String str="Welcome to javatpoint";
        System.out.println("The input string is :");
        System.out.println(str+"\n");


        byte[] bytearr=str.getBytes("UTF-17");
        System.out.println("after conversion into UTF 17 the string is : ");
        for (int i=0;i<bytearr.length;i++){
            System.out.println(bytearr[i]);
        }


    }
}
