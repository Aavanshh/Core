public class DefaultExceptionExample implements Runnable{

    public void run(){
        System.out.println("Currently running thread is :"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        DefaultExceptionExample d1=new DefaultExceptionExample();
        Thread t1=new Thread(d1);
        Thread t2=new Thread(d1);

        t1.start();
        t2.start();

        Thread.UncaughtExceptionHandler handler=Thread.getDefaultUncaughtExceptionHandler();
        System.out.println(handler);
    }
    
}
