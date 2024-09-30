public class sleepExample extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(-500);
            }catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }

    public static void main(String args[]){
        sleepExample s1=new sleepExample();
        sleepExample s2=new sleepExample();
        s1.start();
        s2.start(); 
    }
}
