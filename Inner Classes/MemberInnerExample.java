public class MemberInnerExample {
private int data=30;
class InnerExample{
    void msg(){
        System.out.println("data is "+ data);
    }
}
public static void main(String args[]){
    MemberInnerExample m1=new MemberInnerExample();
    MemberInnerExample.InnerExample m2=m1.new InnerExample();
    m2.msg();
    // m1.msg();
}
    
} 