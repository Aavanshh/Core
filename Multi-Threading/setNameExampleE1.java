public class setNameExampleE1 extends Thread{

    public void run(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        setNameExampleE1 s1=new setNameExampleE1();
        setNameExampleE1 s2=new setNameExampleE1(); 

        System.out.println("name of T1 : "+s1.getName());
        System.out.println("name of T2 : "+s2.getName());

        s1.start();
        s2.start();

        s1.setName("Rishabh");
        System.out.println("after changing name : "+s1.getName());
    }
    
}
