import java.io.DataOutputStream;
import java.net.*;

public class Myclient {
    public static void main(String[] args) {
        try{
        Socket s=new Socket("localhost",6666);
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hello server");
        dout.flush();
        dout.close();
        s.close();
        }catch(Exception e){}
    }
}
