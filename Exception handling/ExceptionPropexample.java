public class ExceptionPropexample {
    // void m(){
    //     int data=50/0;
    // }

    // void n(){
    //     m();
    // }
    // void p(){
    //     try{
    //         n();
    //     }catch(Exception e){
    //         System.out.println("Exception handled");
    //     }
    // }


    void m(){
        //int data=50/0;

        throw new java.io.IOException("Device error");
    }

    void n(){
        m();
    }
    void p(){
        try{
            n();
            
        }catch(Exception e){
            System.out.println("Exception handled");
        }
    }

    public static void main(String args[]){
        ExceptionPropexample e1=new ExceptionPropexample();
        e1.p();
        System.out.println("normal flow"); 
    }
}
