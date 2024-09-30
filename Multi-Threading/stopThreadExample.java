public class stopThreadExample extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            try{
                sleep(50);
                System.out.println(Thread.currentThread().getName());
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        stopThreadExample s1=new stopThreadExample();
        stopThreadExample s2=new stopThreadExample();
        stopThreadExample s3=new stopThreadExample();

        s1.start();s2.start();s3.stop();
        System.out.println("Thread s3 stopped...");
    }
}
