class ABC extends Thread{
    Thread threadToInterrupt;
    public void run(){
        threadToInterrupt.interrupt();
    }
}


public class ThreadJoinExampleE1 {

    public static void main(String[] args) {
        try{
            ABC t1=new ABC();
            t1.threadToInterrupt=Thread.currentThread();
            t1.start();
            t1.join();
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
    }
    
}
