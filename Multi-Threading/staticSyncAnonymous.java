class table{
    synchronized static void printTable(int n){
        for(int i=0;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}


public class staticSyncAnonymous {

    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                table.printTable(2);
            }
        };

        Thread t2=new Thread(){
            public void run(){
                table.printTable(4);
            }
        };

        Thread t3=new Thread(){
            public void run(){
                table.printTable(6);
            }
        };

        Thread t4=new Thread(){
            public void run(){
                table.printTable(8);
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
}
