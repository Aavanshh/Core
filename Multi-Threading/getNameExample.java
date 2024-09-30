public class getNameExample extends Thread {
    public void run(){
        System.out.println("running.....");
    }

    public static void main(String[] args) {
        getNameExample g1=new getNameExample();
        getNameExample g2=new getNameExample();

        System.out.println("name of Thread G1 :"+g1.getName());
        System.out.println("name of Thread G2 :"+g2.getName());

        g1.start();
        g2.start();
    }
}
