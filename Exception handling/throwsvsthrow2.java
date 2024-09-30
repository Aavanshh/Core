public class throwsvsthrow2 {
    public static int divideNum(int m,int n) throws ArithmeticException{
        int div=m/n;
        return div;
    }

    public static void main(String args[]){
        throwsvsthrow2 t1=new throwsvsthrow2();

        try{
            System.out.println(t1.divideNum(45, 0));
        }catch(ArithmeticException ae){
            System.out.println("number can't be divided");
        }
        //System.out.println(t1.divideNum(45, 0));
        System.out.println("rest of code");
    }
}
