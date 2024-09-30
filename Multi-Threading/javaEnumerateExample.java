public class javaEnumerateExample extends Thread{
    javaEnumerateExample(String threadName,ThreadGroup tg){
        super(tg,threadName);
        start();
    }

    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(100);
            }catch(InterruptedException ie){
                System.out.println("Exception Encountered");
            }
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException,SecurityException {
        ThreadGroup t1=new ThreadGroup("Parent Thread");
        ThreadGroup t2=new ThreadGroup(t1,"child Thread");

        javaEnumerateExample j1=new javaEnumerateExample("Thread-1", t1);
        System.out.println("Starting of Thread 1");

        javaEnumerateExample j2=new javaEnumerateExample("Thread-2", t1);
        System.out.println("Starting of Thread 2");

        Thread[] group=new Thread[t1.activeCount()];
        int count=t1.enumerate(group);

        for(int i=0;i<count;i++){
            System.out.println(group[i].getName()+" Found");
        }


    }
}
