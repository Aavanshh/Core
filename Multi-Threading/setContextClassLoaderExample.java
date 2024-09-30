public class setContextClassLoaderExample implements Runnable {

    public void run(){
        System.out.println("Thread is Running");
        ClassLoader loader=Thread.currentThread().getContextClassLoader();

        Thread.currentThread().setContextClassLoader(loader);
        System.out.println("Context class Loader ="+loader);
    }
    
    public static void main(String[] args) {
        setContextClassLoaderExample s1=new setContextClassLoaderExample();
        Thread t1=new Thread(s1);

        t1.start();
    }
}
