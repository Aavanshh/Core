import java.applet.Applet;  
import java.awt.Frame;  
import java.awt.Graphics;  

public class Myviewer extends Frame{
    public static void main(String[] args) throws Exception{
        Class c=Class.forName(args[0]);

        Myviewer v=new Myviewer();
        v.setSize(400,400);
        v.setLayout(null);
        v.setVisible(true);

        Applet a=(Applet)c.newInstance();
        a.start();
        Graphics g=v.getGraphics();
        a.paint(g);
        a.stop();
    }
    
}
