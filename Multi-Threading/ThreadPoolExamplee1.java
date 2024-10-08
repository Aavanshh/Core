import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
    private String message;
    public WorkerThread(String s1){
        this.message=s1;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
        processmessage();
        System.out.println(Thread.currentThread().getName()+" (End)");
        
    }

    private void processmessage(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ie){}
    }
    
}

public class ThreadPoolExamplee1 {

    public static void main(String[] args) {
        ExecutorService executor =Executors.newFixedThreadPool(5);

        for(int i=0;i<10;i++){
            Runnable worker=new WorkerThread(""+i);
            executor.execute(worker);
        }

        executor.shutdown();

        while(!executor.isTerminated()){ }
        System.out.println("finished all Threads");
    }
}
