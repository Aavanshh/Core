public class multiTaskingExample2 implements Runnable{

    public void run(){
        System.out.println("task one");
}

public static void main(String[] args) {
    Thread t1=new Thread(new multiTaskingExample2());
    Thread t2=new Thread(new multiTaskingExample2());
    t1.start();
    t2.start(); 
}
    
}
