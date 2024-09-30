public class isinterruptedExample extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Closing Task ..."+i);
        }
    }

    public static void main(String[] args) {
        isinterruptedExample i1=new isinterruptedExample();
        isinterruptedExample i2=new isinterruptedExample();

        i1.start();
        i2.start();

        System.out.println("is Thread interrupted"+i1.isInterrupted());
        System.out.println("is Thread interrupted"+i2.isInterrupted());

        i1.interrupt();
        System.out.println("is Thread interrupted"+i1.isInterrupted());
        System.out.println("is Thread interrupted"+i2.isInterrupted());
    }
    
}
