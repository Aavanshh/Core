public class destroyExample extends Thread {

    destroyExample(String ThreadName, ThreadGroup tg){
        super(tg, ThreadName);
        start();
    }

    public void run(){
        for(int i=0;i<3;i++){
            try{
                Thread.sleep(10);
            }catch(InterruptedException ie){
                System.out.println("Exception Encountered");
            }
        }

        System.out.println(Thread.currentThread().getName()+" finished executing.");

    }

    public static void main(String[] args) {
        ThreadGroup tg1=new ThreadGroup("Parent Thread");
        ThreadGroup tg2=new ThreadGroup("Child Thread");

        destroyExample d1=new destroyExample("Thread-1", tg1);
        destroyExample d2=new destroyExample("Thread-2", tg2);

        d1.join();
        d2.join();

        tg2.destroy();
        System.out.println(tg2.getName()+" destroyed");

        tg1.destroy();
        System.out.println(tg1.getName()+" destroyed");
    }
    
}
