public class checkAccess extends Thread {

    public void run(){
        System.out.println(Thread.currentThread().getName()+" Finished executing");
    }

    public static void main(String[] args) {
        checkAccess c1=new checkAccess();
        checkAccess c2=new checkAccess();

        c1.start();
        c2.start();

        c1.checkAccess();
        System.out.println(c1.getName()+" has access");

        
        c2.checkAccess();
        System.out.println(c2.getName()+" has access");
    }
    
}
