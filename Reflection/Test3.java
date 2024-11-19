class simple{}

interface My{}

public class Test3 {

    public static void main(String[] args) {
        try{
            Class c=Class.forName("simple");
            System.out.println(c.isInterface());
            
            Class c2=Class.forName("My");
            System.out.println(c2.isInterface());
        }catch(Exception e){}
    }
    
}
