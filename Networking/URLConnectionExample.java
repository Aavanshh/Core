import java.net.*;
import java.io.*;

public class URLConnectionExample {
    public static void main(String[] args) {
        try{
        URL url=new URL("http://www.javatpoint.com/java-tutorial");
        URLConnection urlcon=url.openConnection();
        InputStream stream=urlcon.getInputStream();

        int i;
        while((i=stream.read())!=-1){
            System.out.println((char)i);
        }
    }catch(Exception e){}
    }
}
