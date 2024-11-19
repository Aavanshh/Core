public class removeShutDownhookExample {

    static class Msg extends Thread{
        public void run(){
            System.out.println("bye....");
        }
    }

    public static void main(String[] args) {
        try{
            Msg ms=new Msg();
            Runtime.getRuntime().addShutdownHook(ms);
            System.out.println("the program is beginning...");

            System.out.println("waiting for 2 seconds");
            Thread.sleep(2000);
            Runtime.getRuntime().removeShutdownHook(ms);
            System.out.println("the program is Terminating...");

        }catch(Exception e){}
    }
    
}
