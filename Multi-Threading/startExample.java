public class startExample extends Thread {


    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        startExample s1=new startExample();
        s1.start();

        //s1.start();
    }

    
}