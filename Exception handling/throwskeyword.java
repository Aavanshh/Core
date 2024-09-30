import java.io.IOException;

public class throwskeyword {
    void m() throws IOException{
        throw new IOException("device error");
    }

    void n() throws IOException{
        m();
    }

    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("Exception handled"+e);
        }
    }


    public static void main(String args[]){
        throwskeyword t1=new throwskeyword();
        t1.p();
        System.out.println("normal flow");
    }
}
