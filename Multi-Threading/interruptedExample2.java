public class interruptedExample2 extends Thread{

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        interruptedExample2 i1=new interruptedExample2();
        i1.start();
        i1.interrupt();
    }
    
}
