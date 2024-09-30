class Sender{
    public void SenderMsg(String msg){
        System.out.println("\n Sending a message"+msg);
        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println("Thread Interrupted");
        }
        System.out.println("\n"+msg+" sent");
    }
}

class SenderWThreads extends Thread{
    private String msg;
    Sender sd;

    SenderWThreads(String m,Sender obj){
        msg=m;
        sd=obj;
    }

    public void run(){
        synchronized(sd){
            sd.SenderMsg(msg);
        }
    }
}


public class syncBlockExample2 {
    public static void main(String[] args) {
        Sender sender=new Sender();
        SenderWThreads s1=new SenderWThreads("Rishabh", sender);
        SenderWThreads s2=new SenderWThreads("Welcome to Javatpoint", sender);
        s1.start();
        s2.start();

        try{
            s1.join();s2.join();
        }catch(Exception e){System.out.println("interrupted");}
    }
}
