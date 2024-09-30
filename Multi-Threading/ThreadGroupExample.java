 class ThreadGroupEX implements Runnable {

    public void run(){
        System.out.println("javatpoint");
    }


    
}

public class ThreadGroupExample{
    public static void main(String[] args) {
        
        ThreadGroup group=new ThreadGroup("ThreadGroup");
        ThreadGroup anotherGroup= new ThreadGroup(group,"AnotherGroup");

        Thread t1=new Thread(group,new ThreadGroupEX(),"Thread-1");
        Thread t2=new Thread(anotherGroup,new ThreadGroupEX(),"Thread-2");
        t1.start();
        t2.start();

        System.out.println(t1.getName() +" is a member of "+t1.getThreadGroup().getName());
        System.out.println(t2.getName() +" is a member of "+t2.getThreadGroup().getName());
    }
}
