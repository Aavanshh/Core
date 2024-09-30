import java.applet.*;
import java.awt.*;

public class appletViewer extends Frame{
    public static void main(String[] args) throws Exception {

        Class c=Class.forName(args[0]);

        appletViewer a=new appletViewer();

        a.setSize(400,400);
        a.setLayout(null);
        a.setVisible(true);

        Applet a1=(Applet)c.newInstance();
        a1.start();
        Graphics g=a.getGraphics();
        a1.paint(g);
        a1.stop();
        
        
    }
}