public class isDaemonExample extends Thread {
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon Thread work");
        }else{
            System.out.println("user Thread work");
        }
    }

    public static void main(String[] args) {
        isDaemonExample d1=new isDaemonExample();
        isDaemonExample d2=new isDaemonExample();
        isDaemonExample d3=new isDaemonExample();
        d1.setDaemon(true);
        d1.start();
        d2.start();
        d3.start();
    }
}
