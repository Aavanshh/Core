public class runExample2 extends Thread {

    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        runExample2 r1=new runExample2();
        r1.run();
    }
    
}
