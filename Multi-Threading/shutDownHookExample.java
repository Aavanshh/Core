class MyThread extends Thread{
    public void run(){
        System.out.println("shut down task completed");
    }
}

public class shutDownHookExample {

    public static void main(String[] args) throws Exception{

        Runtime r=Runtime.getRuntime();
        r.addShutdownHook(new MyThread());

        System.out.println("Now main sleeping ....press ctrl+c to exit");
        try{
            Thread.sleep(30);
        }catch(Exception e){}
        
    }
    
}
