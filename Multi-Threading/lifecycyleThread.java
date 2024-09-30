class ABC implements Runnable {

    public void run(){
        try{
            Thread.sleep(100);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("The state of Thread t1 while it invoked method join() on thread t2 : " + lifecycyleThread.t1.getState());
        
        try{
            Thread.sleep(200);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
    
}

public class lifecycyleThread implements Runnable{

    public static Thread t1;
    public static lifecycyleThread obj;

    public static void main(String[] args) {
        obj=new lifecycyleThread();
        t1=new Thread(obj);

        System.out.println("The state of Thread t1 after invoking method start() on it : "+t1.getState());
    }

    public void run(){
        ABC myObj=new ABC();
        Thread t2=new Thread(myObj);

        System.out.println("Th estate of Thread t2 after spawning it : "+t2.getState() );
        t2.start();

        System.out.println("The state of Thread t2 after calling the method start on it -"+t2.getState());

        try{
            Thread.sleep(200);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }

        System.out.println("The state of Thread t2 after invoking the sleep method : "+t2.getState());
        
        try{
            t2.join();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("The state of Thread t2 when it has completed the execution : "+t2.getState());
    }
}
