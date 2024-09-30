import java.lang.reflect.Method;

public class M {

    public static void main(String[] args) throws Exception{
       Class c=A1.class;
       Object obj=c.newInstance();
       
       Method m=c.getDeclaredMethod("cube", new Class[]{int.class});
       m.setAccessible(true);
       m.invoke(obj, 4);
    }
    
}
