public class runExampleE1 extends Thread{

    public void run(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        runExampleE1 e1=new runExampleE1();
        e1.run();
    }
    
}
