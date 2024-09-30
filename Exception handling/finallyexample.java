public class finallyexample {
    public static void main(String args[]){
        try{
            System.out.println("inside try block");
            int data=20/0;
            System.out.println(data);
        }catch(ArithmeticException ae){
            System.out.println("Exception handled");
            System.out.println(ae);
        }finally{
            System.out.println("finally block executed");
        }
        System.out.println("rest of the code");
    }
}
