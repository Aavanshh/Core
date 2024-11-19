class test{}

public class simple{
       // Class c=Class.forName("test");
        // System.out.println(c.getName());

        void printName(Object obj){
            Class c=obj.getClass();
            System.out.println(c.getName());
        }

        public static void main(String[] args) throws Exception {
     test t=new test();
     simple s=new simple();
     s.printName(t);  
    }
}