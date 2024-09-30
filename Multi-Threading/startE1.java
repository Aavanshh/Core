public class startE1 extends Thread {
    public void run(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        startE1 e1=new startE1();
        e1.start();
        e1.start();
    }
    
}
