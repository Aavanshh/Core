import java.io.*;

class ThreadJoin extends Thread{
    public void run(){
        for(int j=0;j<2;j++){
            try{
                Thread.sleep(300);
                System.out.println("The current thread name is : "+Thread.currentThread().getName());
            }catch(Exception e){
                System.out.println("Exception is : "+e);
            }
            System.out.println(j);
        }
    }
}

public class ThreadJoinExample {

    public static void main(String[] args) {
        ThreadJoin t1=new ThreadJoin();
        ThreadJoin t2=new ThreadJoin();
        ThreadJoin t3=new ThreadJoin();

        t1.start();
        try{
            System.out.println("The current Thread name is : "+Thread.currentThread().getName());
        t1.join();
        }catch(Exception e){
            System.out.println(e);
        }

        t2.start();
        try{
            System.out.println("The current Thread name is : "+Thread.currentThread().getName());
        t2.join();
        }catch(Exception e){
            System.out.println(e);
        }
        t3.start();
    }
    
}
