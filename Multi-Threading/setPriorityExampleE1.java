import java.lang.*;
public class setPriorityExampleE1 extends Thread{

    public void run(){
        System.out.println("Inside the Thread.....");
    }

    public static void main(String[] args) {
        setPriorityExampleE1 s1=new setPriorityExampleE1();
        setPriorityExampleE1 s2=new setPriorityExampleE1();
        setPriorityExampleE1 s3=new setPriorityExampleE1(); 

        System.out.println("Thread t1 priority : "+s1.getPriority());
        System.out.println("Thread t2 priority : "+s2.getPriority());
        System.out.println("Thread t3 priority : "+s3.getPriority());

        s1.setPriority(6);
        s2.setPriority(3);
        s3.setPriority(9);

        System.out.println("Thread t1 priority : "+s1.getPriority());
        System.out.println("Thread t2 priority : "+s2.getPriority());
        System.out.println("Thread t3 priority : "+s3.getPriority());

        System.out.println("currently Executing Thread :"+Thread.currentThread().getName());
        System.out.println("Priority of main Thread :"+Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println("Priority of main Thread :"+Thread.currentThread().getPriority());

    }
    
}
