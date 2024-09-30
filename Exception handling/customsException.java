class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}


public class customsException {
    
    static void validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age is not valid to vote");
        }else{
            System.out.println("You can vode");
        }
    }


    public static void main(String args[]){
        try{
            validate(6);
        }catch(InvalidAgeException e){
            System.out.println("Caught Exception");
            System.out.println("Exception occurred"+e);
        }
        System.out.println("Rest of the code");
    }
}
