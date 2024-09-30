import java.io.IOException;

class Parent{
    // void msg() throws ArithmeticException{
    //     System.out.println("parent method");
    // }
    void msg() throws Exception{
        System.out.println("parent method");
    }
}


public class testException1 extends Parent {

    // void msg() throws IOException{
    //     System.out.println("text-Exception child");
    // }

    // void msg() throws Exception{
    //     System.out.println("text-Exception child");
    // }

    // void msg() throws ArithmeticException{
    //     System.out.println("text-Exception child");
    // }

    void msg() {
        System.out.println("text-Exception child");
    }

    public static void main(String args[]){
        Parent p=new testException1();

        // testException1 te=new testException1();
        // te.msg();
        // p.msg();

        try{
            p.msg();
        }catch(Exception e){}
    }
    
}
