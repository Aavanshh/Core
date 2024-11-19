public class multiTaskingExample1 extends Thread {
    public void run(){
        System.out.println("task one");
    }

    public static void main(String[] args) {
        multiTaskingExample1 m1=new multiTaskingExample1();
        multiTaskingExample1 m2=new multiTaskingExample1();
        multiTaskingExample1 m3=new multiTaskingExample1();

        m1.start();
        m2.start();
        m3.start();
    }
    
}
