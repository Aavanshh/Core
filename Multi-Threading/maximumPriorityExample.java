public class maximumPriorityExample extends Thread{
    public void run(){
        // System.out.println("Priority of current thread is "+Thread.currentThread().getPriority());
        System.out.println("running .....");
    
    }

    public static void main(String[] args) {
        maximumPriorityExample m1=new maximumPriorityExample();
        // m1.setPriority(Thread.NORM_PRIORITY);

        // m1.setPriority(7);
        m1.setPriority(12);

        System.out.println("Priority of Thread m1 is :"+m1.getPriority());
        m1.start();
    }
}
