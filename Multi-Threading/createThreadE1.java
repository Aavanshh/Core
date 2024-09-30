public class createThreadE1 extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        createThreadE1 e1=new  createThreadE1();
        e1.start();
    }
    
}
