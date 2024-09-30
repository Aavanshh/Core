public class nestedtryexample {
    public static void main(String args[]){
        // try{
        //     try{
        //         System.out.println("divide by zero");
        //         int b=39/0;
        //     }catch(ArithmeticException ae){
        //         System.out.println(ae);
        //     }

        //     try{
        //         int a[]=new int[5];
        //         a[5]=4;
        //     }catch(ArrayIndexOutOfBoundsException aoe){
        //         System.out.println(aoe);
        //     }

        //     System.out.println("other statement");


        // }catch(Exception e){
        //     System.out.println("handled the exception { Outer block}");
        // }

        try{
            try{
                try{
                    int arr[]={1,2,3,5,4};
                    System.out.println(arr[10]);
                }catch(ArithmeticException ae){
                    System.out.println("arithmetic exception");
                    System.out.println("inner block 2");
                }
            }catch(ArithmeticException ae){
                System.out.println("arithmetic exception");
                System.out.println("inner block 2");
        }
    }catch(ArrayIndexOutOfBoundsException aoe){
        System.out.println(aoe);
        System.out.println("Outer main try block");
    }catch(Exception e5){
        System.out.println("Exception");
        System.out.println("Handled in main try block");
    }
}
}
