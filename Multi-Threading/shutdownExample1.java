class Mythread extends Thread{

    public void run(){
        System.out.println("shut down hook task completed");
    }
    
}

public class shutdownExample1{
    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        r.addShutdownHook(new Mythread());
        System.out.println("now main sleeping press Ctrl+c to exit");
        try{
            Thread.sleep(3000);
        }catch(Exception e){}
    }
}
