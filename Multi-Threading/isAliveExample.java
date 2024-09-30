public class isAliveExample extends Thread {
    public void run(){
        try{
            Thread.sleep(300);
            System.out.println("is run() method is alive :"+Thread.currentThread().isAlive());
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        isAliveExample a1=new isAliveExample();
        System.out.println("before starting Thread is Alive :"+a1.isAlive());
        a1.start();
        System.out.println("after starting Thread is Alive :"+a1.isAlive());

    }
    
}
