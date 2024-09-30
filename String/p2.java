import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class p2 {
    public static void main(String args[]){
        String s="sachin"+" tendulkar";
       // System.out.println(s);

        String s1=50+10+"sachin"+25+20;
       // System.out.println(s1);

        String r1="Rishabh";
        String r2=" Kashyap";
        String r3=r1.concat(r2);
        //System.out.println(r3);

        StringBuilder sb1=new StringBuilder("Hello");
        StringBuilder sb2=new StringBuilder(" World");

        StringBuilder sb3=sb1.append(sb2);

        //System.out.println(sb3);

        String sc1 = new String("Rishabh");
        String sc2 = new String(" Kashyap");

        String sc3=String.format("%s%s", sc1,sc2);
       // System.out.println(sc3.toString());

       String j1=new String("vinod");
       String j2=new String(" Rishabh");

       String vr=String.join("", j1,j2);
       //System.out.println(vr.toString());

       StringJoiner sj=new StringJoiner(",");
       sj.add("anil");
       sj.add(" sangeeta");
       //System.out.println(sj.toString());

       List<String> liststr=Arrays.asList("abc","pqr","xyz");
       String strr=liststr.stream().collect(Collectors.joining(","));
       System.out.println(strr.toString());
    }
}
