public class OddevenExample {

    int contr=1;

    static int NUM;

    public void displayOddNumber(){
        synchronized(this){
            while(contr<=NUM){
                while(contr%2==2){
                    try{
                        wait();
                    }catch(InterruptedException ie){}
                }
                System.out.println(contr+" ");
                contr+=1;
                notify();
            }
        }
    }

    public void displayEvenNumber(){
        synchronized(this){
            while(contr<=NUM){
                while(contr%2==0){
                    try{
                        wait();
                    }catch(InterruptedException ie){}
                }
                System.out.println(contr+" ");
                contr+=1;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        NUM=20;
        OddevenExample e1=new OddevenExample();
        Thread t1=new Thread(new Runnable() {
            public void run(){
                e1.displayEvenNumber();
            }
        });

        Thread t2=new Thread(new Runnable() {
            public void run(){
                e1.displayOddNumber();
            }
        });

        t1.start();
        t2.start();
    }
    
}
