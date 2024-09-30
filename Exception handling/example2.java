public class example2 {
    public static void main(String args[]){
        // int i=50;
        // int j=0;
        // int data;
        // try{
        //     data=i/j;
        // }catch(Exception e){
        //     int data2=50/0;
        //     System.out.println(e);
        // }
        // System.out.println("Rest of the code");

        // try{
        //     int data=50/0;
        // }catch(ArrayIndexOutOfBoundsException ae){
        //     System.out.println(ae);
        // }
        // System.out.println("rest of the code3");

        try{
            int arr[]={1,2,3};
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }
        System.out.println("rest code");
    }
}
