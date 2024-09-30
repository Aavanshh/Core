// interface showable{
// void show();

// interface Message{
//     void msg();
// }
// }

class A{
    interface message{
        void msg();
    }
}


public class nestedInterface implements A.message {

    public void msg(){
        System.out.println("hello nested interface");
    }

    public static void main(String[] args) {
        A.message m1=new nestedInterface();
        m1.msg();
    }
    
}
