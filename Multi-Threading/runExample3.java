public class runExample3 extends Thread{

    public void run(){
        for(int i=0;i<6;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }

            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        runExample3 r1=new runExample3();
        runExample3 r2=new runExample3();

        r1.run();
        r2.run();
    }
    
}
