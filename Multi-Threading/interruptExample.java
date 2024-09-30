public class interruptExample extends Thread{
    public void run(){
        try{
            Thread.sleep(500);
            System.out.println("Rishabh");
        }catch(InterruptedException e){
            // throw new RuntimeException("Thread Interrupted : "+e);
            System.out.println("Exception Handled :"+e);
        }
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        interruptExample i1=new interruptExample();
        interruptExample i2=new interruptExample();
        i1.start();
        // try{
        //     i1.interrupt();
        // }catch(Exception e){
        //     System.out.println("Exception Handled :"+e);
        // }
        i1.interrupt();
    }
}
