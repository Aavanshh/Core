public class startExample2 implements Runnable {

    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String args[]){
        startExample2 s1=new startExample2();
        Thread t1=new Thread(s1);
        t1.start();

    }
    
}
