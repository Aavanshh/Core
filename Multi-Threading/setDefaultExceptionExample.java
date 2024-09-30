public class setDefaultExceptionExample implements Runnable{

    public void run(){
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new setDefaultExceptionExample());
        thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread thread,Throwable e){
                System.out.println("Exception caught : "+e);
            }
        });
        thread.start();
    }
    
}
