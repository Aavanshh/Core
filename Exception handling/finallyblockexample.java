public class finallyblockexample {
    public static void main(String args[]){
    //    try{
    //     int data=25/5;
    //     System.out.println(data);
    //    }catch(NullPointerException npe){
    //     System.out.println(npe);
    //    }finally{
    //     System.out.println("finally block executed");
    //    }


    // try{
    //     int data=25/0;
    //     System.out.println(data);
    //    }catch(NullPointerException npe){
    //     System.out.println(npe);
    //    }finally{
    //     System.out.println("finally block executed");
    //    }


    try{
        int data=25/0;
        System.out.println(data);
       }catch(ArithmeticException ae){
        System.out.println(ae);
       }finally{
        System.out.println("finally block executed");
       }
       System.out.println("rest of the code");
    }
}
