import java.lang.Thread;
import java.io.*;
public class ThreadSleepE2 {
    public static void main(String[] args) {
        try{
            for(int j=0;j<5;j++){
                // Thread.sleep(1000);
                Thread.sleep(-1000);
                System.out.println(j);
            }
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
    }
}
