class MyCustomException extends Exception{

}

public class customException2 {
   public static void main(String args[]){
    try{
        throw new MyCustomException();
    }catch(MyCustomException mce){
        System.out.println("Caught an Exception");
        System.out.println(mce.getMessage());
    }
    System.out.println("Rest of the code");
   } 
}
