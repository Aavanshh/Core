import java.io.IOException;

class M{
    // void method() throws IOException{
    //     throw new IOException("device error");
    // }
    void method() throws IOException{
        throw new IOException("device error");
        // System.out.println("device operation performed");
    }
}

public class throwskeyword2 {
    public static void main(String args[]) throws IOException{
        // try{
        //     M m=new M();
        //     m.method();
        // }catch(Exception e){
        //     System.out.println("Exception handled"+e);
        // }

        
            M m=new M();
            m.method();
        
        System.out.println("normal flow....");
    }
}
