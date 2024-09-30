public class throwsvsthrow1 {
    public static void checkNum(int num){
        if(num<1){
            throw new ArithmeticException("number is negative or zero");
        }else{
            System.out.println("Squeare of "+num+" is :"+(num*num));
        }
    }

    public static void main(String args[]){
        throwsvsthrow1 t1=new throwsvsthrow1();
        t1.checkNum(-3);
        System.out.println("rest of the code");
    }
}
