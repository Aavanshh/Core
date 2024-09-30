public class DaemonExampleE1 extends Thread{

    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread work");
        }else{
            System.out.println("user Thread work");
        }
    }

    public static void main(String[] args) {
        DaemonExampleE1 d1=new DaemonExampleE1();
        DaemonExampleE1 d2=new DaemonExampleE1();
        DaemonExampleE1 d3=new DaemonExampleE1(); 

        
        d1.setDaemon(true);
        d1.start();
        // d1.setDaemon(true);
        d2.start();
        d3.start();
    }
    
}
