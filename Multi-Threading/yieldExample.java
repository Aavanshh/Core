public class yieldExample extends Thread {
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println(Thread.currentThread().getName()+" in Control");
        }

    }

    public static void main(String[] args) {
        yieldExample y1=new yieldExample();
        yieldExample y2=new yieldExample();

        y1.start();
        y2.start();

        for(int i=0;i<3;i++){
            y1.yield();
            System.out.println(Thread.currentThread().getName()+" in control.");
        }
    }
}
