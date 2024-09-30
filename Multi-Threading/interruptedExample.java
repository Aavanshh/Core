public class interruptedExample extends Thread {
    public void run(){
        for(int i=1;i<3;i++){
            System.out.println("doing task...."+i);
        }
    }

    public static void main(String[] args) {
        interruptedExample i1=new interruptedExample();
        interruptedExample i2=new interruptedExample();

        i1.start();
        // i2.start();

        System.out.println("is i1 thread interrupted"+i1.interrupted());

        i1.interrupt();

        System.out.println("is i1 thread interrupted"+i1.interrupted());
        // System.out.println("is i2 thread interrupted"+i1.interrupted());
    }
    
}
