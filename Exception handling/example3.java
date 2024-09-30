import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class example3 {
    public static void main(String args[]){
        PrintWriter pw;
        try{
            pw=new PrintWriter("jtp.txt");
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("file saved successfully");
    }
}
