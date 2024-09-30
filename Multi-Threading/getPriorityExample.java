public class getPriorityExample extends Thread {

    public void run(){
        System.out.println("running Thread is :"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        getPriorityExample g1=new getPriorityExample();
        getPriorityExample g2=new getPriorityExample();

        System.out.println("G1 thread priority :"+g1.getPriority());

        System.out.println("G2 thread priority :"+g2.getPriority());

        g1.start();
        g2.start();

        // System.out.println("G1 thread priority :"+g1.getPriority());

        // System.out.println("G2 thread priority :"+g2.getPriority());
    }

    
    
}
