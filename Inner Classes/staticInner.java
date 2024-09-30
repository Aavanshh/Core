public class staticInner {
    static int data=30;
    static class inner{
       static void msg(){
            System.out.println("data is :"+data);
        }
    }

    public static void main(String args[]){
        // staticInner.inner obj1=new staticInner.inner();
        // obj1.msg();

        staticInner.inner.msg();

    }
}
