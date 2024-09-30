import java.io.*;

class ThreadName extends Thread{
    ThreadName(String threadName){
        super(threadName);
    }

    public void run(){
        System.out.println("the thread is running......");
    }
}

public class setNameExampleE2 {
    public static void main(String[] args) {
        ThreadName t1=new ThreadName("Rishabh");
        ThreadName t2=new ThreadName("Kashyap");

        System.out.println("Thread -1 "+t1.getName());
        System.out.println("Thread -2 "+t2.getName());

        t1.start();
        t2.start();
    }
}
