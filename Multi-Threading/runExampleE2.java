public class runExampleE2 extends Thread{

    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        runExampleE2 e1=new runExampleE2();
        runExampleE2 e2=new runExampleE2();

        e1.run();e2.run();
    }
    
}
