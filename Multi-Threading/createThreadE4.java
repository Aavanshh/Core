public class createThreadE4 implements Runnable {
    public void run(){
        System.out.println("Now the Thread is running......");
    }
    
    public static void main(String[] args) {
        Runnable r1=new createThreadE4();
        Thread t1=new Thread(r1,"My new Thread 1");

        t1.start();

        String str=t1.getName();
        System.out.println(str);
    }
}
