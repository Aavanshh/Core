public class joinExample extends Thread{
    public void run(){
        for(int i=0;i<=6;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        joinExample j1=new joinExample();
        joinExample j2=new joinExample();
        joinExample j3=new joinExample();

        j1.start();
        {
            try{
                // j1.join();
                j1.join(1500);
            }catch(Exception e){
                System.out.println(e);
            }


        }
        j2.start();
        j3.start();
    }
}
