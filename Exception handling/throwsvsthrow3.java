public class throwsvsthrow3 {
    static void method() throws ArithmeticException{
        System.out.println("inside method");
        throw new ArithmeticException("throwing arithmetic exception");
    }

    public static void main(String args[]){
        try{
            method();
        }catch(ArithmeticException e){
            System.out.println("exception caught");
        }
    }
}
