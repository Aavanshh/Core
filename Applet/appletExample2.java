import java.applet.Applet;  
import java.awt.Graphics;

public class appletExample2 extends Applet{

    public void paint(Graphics g){
        String str=getParameter("msg");
        g.drawString(str, 50, 50);
    }
    
}

/*
 *   
<applet code="UseParam.class" width="300" height="300">  
<param name="msg" value="Welcome to applet">  
</applet>  

 */