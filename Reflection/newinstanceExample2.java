import static java.lang.System.out;
import java.lang.reflect.*;
import javax.swing.*;


public class newinstanceExample2 {
    
    public static void main(String[] args) throws ClassNotFoundException{
        Object obj=null;
        Class classDefinition=Class.forName("javax.swing.JLabel");
        obj=classDefinition.newInstance();
        JLabel l1;

        if(obj instanceof JLabel){
            l1=(JLabel)obj;
        }else{
            return;
        }

        out.println(l1.getText());
        
    }
}
