public class createThreadE3 {

    public static void main(String[] args) {
        Thread t1=new Thread("My first Thread");
        t1.start();

        String str=t1.getName();
        System.out.println(str);
    }
    
}
