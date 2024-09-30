class UserDefinedException extends Exception{
    public UserDefinedException(String str){
        super(str);
    }
}


public class throw3 {

    public static void main(String args[]){
        try{
            throw new UserDefinedException("This is user-defined exception");
        }catch(UserDefinedException ude){
            System.out.println("caught Exception");
            System.out.println(ude.getMessage());
        }
    }
    
}
