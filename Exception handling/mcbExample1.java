public class mcbExample1 {
    public static void main(String args[]){
        // try{
        //     int a[]=new int[5];
        //     //a[5]=30/0;
        //     //System.out.println(a[5]+a[10]);
        //     // System.out.println(a[10]);

        //     String s=null;
        //     System.out.println(s.length());
        // }
        // catch(ArithmeticException ae){
        //     System.out.println("arithmetic exception occurs");
        // }catch(ArrayIndexOutOfBoundsException aoe){
        //     System.out.println("array exception occurs");
        // }catch(Exception e){
        //     System.out.println("parent exception occurs");
        // }


        try{
            int a[]=new int[5];
            a[5]=30/0;
        }catch(Exception e){
            System.out.println("common task completed");
        }catch(ArithmeticException ae){
            System.out.println("Arithmetic exception completed");
        }catch(ArrayIndexOutOfBoundsException aoe){
            System.out.println("Array exception completed");
        }

        System.out.println("Rest of code");
    }
}
