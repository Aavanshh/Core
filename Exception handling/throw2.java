import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class throw2 {
    public static void method() throws FileNotFoundException{
        FileReader file=new FileReader("C:\\Users\\Rishabh\\Desktop\\Exception handling\\abc.txt");
        BufferedReader fileinput=new BufferedReader(file);

        throw new FileNotFoundException();
    }

    public static void main(String args[]){
        try{
            method();
        }catch(FileNotFoundException e){System.out.println(e);}
        System.out.println("rest of code");
    }
}
