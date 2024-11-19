import java.io.*;
import java.net.*;

public class httpUrlConnectionExample{
    public static void main(String[] args) {
        try{
        URL url=new URL("https://www.instagram.com/");
        HttpURLConnection uc=(HttpURLConnection)url.openConnection();

        for(int i=0;i<5;i++){
            System.out.println(uc.getHeaderFieldKey(i)+" "+uc.getHeaderField(i));
        }
        uc.disconnect();
    }catch(Exception e){}
    }
}