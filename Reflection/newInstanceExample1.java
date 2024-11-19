class simple{
    void message(){
        System.out.println("helo");
    }
}

public class newInstanceExample1 {
    public static void main(String[] args) {
        try{
            Class c=Class.forName("simple");
            simple s=(simple)c.newInstance();
            s.message(); 
    }catch(Exception e){System.out.println(e);}
    }
}
