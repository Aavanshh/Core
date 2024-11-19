import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class eventHandling extends Applet implements ActionListener {

    Button b;
    TextField tf;

    public void init(){
        tf=new TextField();
        tf.setBounds(30,40,150,20);
        b=new Button("click");
        b.setBounds(80,150,60,50);

        add(b);
        add(tf);
        b.addActionListener(this);

        setLayout(null);
    }

    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }
    
}
/*<applet code="eventHandling.class" width="300" height="300">  
</applet>   */
