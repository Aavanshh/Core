public class getStateExample implements Runnable {

    public void run(){
        Thread.State state=Thread.currentThread().getState();
        System.out.println("Running Thread name :"+Thread.currentThread().getName());
        System.out.println("State of Thread :"+state);

    }
    public static void main(String[] args) {
        getStateExample g1=new getStateExample();
        Thread t1=new Thread(g1);
        Thread t2=new Thread(g1);

        t1.start();
        t2.start();
    }
}
