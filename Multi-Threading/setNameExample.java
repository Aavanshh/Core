public class setNameExample extends Thread {
    public void run(){
        System.out.println("running....");
    }

    public static void main(String[] args) {
        setNameExample s1=new setNameExample();
        setNameExample s2=new setNameExample();

        s1.start();
        s2.start();

        s1.setName("Rishabh");
        s2.setName("Kashyap");

        System.out.println("after changing name :"+s1.getName());
        System.out.println("after changing name :"+s2.getName());
    }
}
