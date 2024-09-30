class table{
    synchronized void printTable(int n){
        for(int i=0;i<=5;i++){
            System.out.println(n*i);

            try{
                Thread.sleep(400);
            }catch(Exception e){}
        }
    }
}


public class syncExample3 {

    public static void main(String[] args) {
        final table obj=new table();

        Thread t1=new Thread(){
            public void run(){
                obj.printTable(5);
            }
        };

        Thread t2=new Thread(){
            public void run(){
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
    
}
