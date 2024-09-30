public class setNameExampleE3 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        setNameExampleE3 s1=new setNameExampleE3();
        setNameExampleE3 s2=new setNameExampleE3();

        s1.start();
        s2.start();
    }
    
}
