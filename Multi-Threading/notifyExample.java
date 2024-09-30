class Notify1 extends Thread{
    public void run(){
        synchronized(this){
            System.out.println("Starting of Thread :"+Thread.currentThread().getName());
            try{
                this.wait();
            }catch(InterruptedException ie){
                        ie.printStackTrace();}
                System.out.println(Thread.currentThread().getName()+" ....Notified");
            
        }
    }
}

class Notify2 extends Thread{
    Notify1 notify1;
    Notify2(Notify1 notify1){
        this.notify1=notify1;
    }
    public void run(){
        synchronized(this.notify1){
            System.out.println("Starting of Thread :"+Thread.currentThread().getName());
            try{
                this.notify1.wait();
            }catch(InterruptedException ie){
                        ie.printStackTrace();}
                System.out.println(Thread.currentThread().getName()+" ....Notified");
            
        }
    }
}

class Notify3 extends Thread{
    Notify1 notify1;
    Notify3(Notify1 notify1){
        this.notify1=notify1;
    }
    public void run(){
        synchronized(this.notify1){
            System.out.println("Starting of Thread :"+Thread.currentThread().getName());
            
                this.notify1.notify();
            
                System.out.println(Thread.currentThread().getName()+" ....Notified");
            
        }
    }
}

public class notifyExample {

    public static void main(String[] args) throws InterruptedException {

        Notify1 n1=new Notify1();
        Notify2 n2=new Notify2(n1);
        Notify3 n3=new Notify3(n1);

        Thread t1=new Thread(n1,"Thread-1");
        Thread t2=new Thread(n2,"Thread-2");
        Thread t3=new Thread(n3,"Thread-3");

        t1.start();
        t2.start();
        Thread.sleep(500);
        t3.start();
        
    }
    
}
