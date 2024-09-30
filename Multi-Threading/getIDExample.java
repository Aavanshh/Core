public class getIDExample extends Thread {
    public void run(){
        System.out.println("running.....");
    } 
    
    public static void main(String[] args) {
        getIDExample g1=new getIDExample();
        System.out.println("Name of Thread "+g1.getName());
        System.out.println("ID of Thread "+g1.getId());

        g1.start();
    }
}
