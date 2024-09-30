public class createThreadE2 implements Runnable {
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        createThreadE2 e2=new createThreadE2();
        Thread t1=new Thread(e2);
        t1.start(); 
    }
}
