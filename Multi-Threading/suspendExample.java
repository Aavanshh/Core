public class suspendExample extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
                sleep(500);
                System.out.println(Thread.currentThread().getName());
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        suspendExample s1=new suspendExample();
        suspendExample s2=new suspendExample();
        suspendExample s3=new suspendExample();

        s1.start();
        s2.start();
        s2.suspend();
        s3.start();
        s2.resume();
    }
}
