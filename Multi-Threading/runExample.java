public class runExample implements Runnable {

    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        runExample r1=new runExample();
        Thread t1=new Thread(r1);
        t1.start();
    }
    
}
