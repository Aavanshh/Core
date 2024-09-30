public class HoldLockexample implements Runnable {

    public void run(){
        System.out.println("Currently executing Thread is :"+Thread.currentThread());
        System.out.println("Does thread hold locks ? +"+Thread.holdsLock(this));

        synchronized(this){
            System.out.println("Does thread hold locks ? +"+Thread.holdsLock(this));

        }
    }

    public static void main(String[] args) {
        HoldLockexample g1=new HoldLockexample();
        Thread t1=new Thread(g1);
        t1.start();
    }
    
}
