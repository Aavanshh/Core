public class setdaemonexample extends Thread{
    public void run(){
        // if(Thread.currentThread().isDaemon()){
        //     System.out.println("Daemon Thread  work");
        // }else{
        //     System.out.println("user Thread work");
        // }

        System.out.println("Name of Thread :"+Thread.currentThread().getName());
        System.out.println("Daemon :"+Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        setdaemonexample s1=new setdaemonexample();
        setdaemonexample s2=new setdaemonexample();
        setdaemonexample s3=new setdaemonexample();
        
        s1.setDaemon(true);
        s1.start();
        s2.setDaemon(true);
        s2.start();
        s3.start();
    }
    
}
