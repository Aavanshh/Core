import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.text.*;

class Tasks implements Runnable{
    private String taskName;

    public Tasks(String str){
        this.taskName=str;
    }

    public void run(){
        try{
            for(int j=0;j<=5;j++){
                if(j==0){
                    Date df=new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization time of task name :"+taskName+" = "+sdf.format(df));
                }else{
                    Date df=new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Time of execution for task name :"+taskName+" = "+sdf.format(df));
                  
                }
                Thread.sleep(1000);
            }
            System.out.println(taskName +" is completed.");
        }catch(InterruptedException is){}
    }
}

public class ThreadPoolExamplee2 {
    static final int MAX_th=3;

    public static void main(String[] args) {
        Runnable rb1=new Tasks("Task 1");
        Runnable rb2=new Tasks("Task 2");
        Runnable rb3=new Tasks("Task 3");
        Runnable rb4=new Tasks("Task 4");
        Runnable rb5=new Tasks("Task 5");

        ExecutorService pl=Executors.newFixedThreadPool(MAX_th);
        pl.execute(rb1);
        pl.execute(rb2);
        pl.execute(rb3);
        pl.execute(rb4);
        pl.execute(rb5);

        pl.shutdown();
    }
}
