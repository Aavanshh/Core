import java.util.StringTokenizer;

public class token {
    public static void main(String args[]){
        //StringTokenizer st=new StringTokenizer("my name is rishabh");
        //while(st.hasMoreTokens()){
        //    System.out.println(st.nextToken());
        //}
        //System.out.println("next token is :"+st.nextToken());

        StringTokenizer st=new StringTokenizer("my name is rishabh"," "); 
    
        //while(st.hasMoreTokens()){
           // System.out.println(st.nextToken());
        //}
        System.out.println("total no :"+st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextElement());
            
        }

        
    }
}
