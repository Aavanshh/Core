import static java.lang.System.out;  
import java.lang.reflect.*;  
import javax.swing.*;  

public class newinstanceExample3 {
    public static void main(String[] args) {
        try{
            Class[] t={String.class};
            Class classdef=Class.forName("javax.swing.JLabel");

            Constructor cons=classdef.getConstructor(t);
            Object[] objct={"My label in Reflection"};

            Object ob=cons.newInstance(objct);
            JLabel l1;
            if(ob instanceof JLabel){
                l1=(JLabel)ob;
            }else{
                return;
            }

            out.println(l1.getText());
        }catch (InstantiationException ie)   
        {  
        out.println(ie);  
        }   
        catch (IllegalAccessException ie)   
        {  
        System.out.println(ie);  
        }    
              
        catch (InvocationTargetException ie)   
        {  
        out.println(ie);  
        }  
        catch (ClassNotFoundException e)   
        {  
        out.println(e);  
        }  
              
        catch (NoSuchMethodException e)   
        {  
        out.println(e);  
        } 
    }
}
