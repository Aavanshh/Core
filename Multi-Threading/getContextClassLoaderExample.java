public class getContextClassLoaderExample implements Runnable {

    public void run(){
        System.out.println("thread is Running");
    }

    public static void main(String[] args) {
        getContextClassLoaderExample g1=new getContextClassLoaderExample();

        Thread t1=new Thread(g1);

        t1.start();

        ClassLoader loader=t1.getContextClassLoader();
        t1.setContextClassLoader(loader);

        System.out.println("Context Class Loader :"+ loader);
        System.out.println("Parent :"+ loader.getParent());
        System.out.println("Class :"+ loader.getClass());
    }
    
}
