public class activeCountexample extends Thread {

    activeCountexample(String Threadname,ThreadGroup tg){
        super(tg,Threadname);start();
    }

    public void run(){
        System.out.println("Running Thread is : "+Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        ThreadGroup tg=new ThreadGroup("Parent Thread Group");
        activeCountexample a1=new activeCountexample("Thread-1",tg);
        activeCountexample a2=new activeCountexample("Thread-2",tg);

        System.out.println("number of active threads : "+tg.activeCount());
    }
}
