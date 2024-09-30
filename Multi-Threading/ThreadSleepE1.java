public class ThreadSleepE1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadSleepE1 t1=new ThreadSleepE1();
        ThreadSleepE1 t2=new ThreadSleepE1();

        t1.start();
        t2.start();
    }
    
}
