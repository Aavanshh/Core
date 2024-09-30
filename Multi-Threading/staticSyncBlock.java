class Table{
    synchronized static void printTable(int n){
        for(int i=0;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }
    }
}

class MyThread1 extends Thread{
    
    public void run(){
        Table.printTable(2);
    }
}

class MyThread2 extends Thread{
    public void run(){
        Table.printTable(100);
    }
}

class MyThread3 extends Thread{
    public void run(){
        Table.printTable(200);
    }
}

class MyThread4 extends Thread{
    public void run(){
        Table.printTable(300);
    }
}

public class staticSyncBlock {

    public static void main(String[] args) {
        MyThread1 m1=new MyThread1();
        MyThread2 m2=new MyThread2();
        MyThread3 m3=new MyThread3();
        MyThread4 m4=new MyThread4();
        m1.start();
        m2.start();
        m3.start();
        m4.start();
    }
    
}
