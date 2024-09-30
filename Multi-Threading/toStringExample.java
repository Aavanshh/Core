public class toStringExample implements Runnable {
    Thread t;
    toStringExample(){
        t=new Thread(this);
        t.start();
    }

    public void run(){
        System.out.println(t.toString());
    }
    public static void main(String[] args) {
        new toStringExample();
    }
    
}
