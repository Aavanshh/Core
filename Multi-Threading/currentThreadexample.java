public class currentThreadexample extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        currentThreadexample c1=new currentThreadexample();
        currentThreadexample c2=new currentThreadexample();

        c1.start();
        c2.start();
    }
}
