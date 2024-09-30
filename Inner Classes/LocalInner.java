public class LocalInner {
    private int data=30;
    void display(){
        int value=50;
        class Locally{
            void msg(){
                System.out.println(value);
                // System.out.println(data);
            }
        }

        Locally l1=new Locally();
        l1.msg();
    }

    public static void main(String args[]){
        LocalInner li=new LocalInner();
        li.display();
    }


    
}
