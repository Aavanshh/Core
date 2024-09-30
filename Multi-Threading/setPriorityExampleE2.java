import java.lang.*;

public class setPriorityExampleE2 extends Thread{

    public void run(){
        System.out.println("Inside run method.....");
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(17);

        System.out.println("Priority of mainthread :"+Thread.currentThread().getPriority());
        setPriorityExampleE2 s1=new setPriorityExampleE2();

        System.out.println("Priority of Thread t1 : "+s1.getPriority());
    }
    
}
