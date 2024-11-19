import java.applet.*;
import java.awt.*;

public class displayImage extends Applet{
    Image picture;

    public void init(){
        picture=getImage(getDocumentBase(),"abc.jpg");
    }

    public void paint(Graphics g){

        for(int i=0;i<500;i++){
        g.drawImage(picture, i, 30, this);

        try{
            Thread.sleep(500);
        }catch(Exception e){}
        }
    }
}

/*<applet code="displayImage.class" width="300" height="300"> </applet>  */