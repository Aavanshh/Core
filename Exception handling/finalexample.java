public class finalexample{
    final int age=18;
    void display(){
        age=55;
    }

    public static void main(String args[]){
        finalexample fe=new finalexample();
        fe.display();
    }
}