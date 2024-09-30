public class ThreadJoinExampleE2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadJoinExampleE2 t1=new ThreadJoinExampleE2();
        ThreadJoinExampleE2 t2=new ThreadJoinExampleE2();
        ThreadJoinExampleE2 t3=new ThreadJoinExampleE2();

        t1.start();
       try{
        // t1.join();
        t1.join(1500);
        }catch(Exception e){
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
    
}
