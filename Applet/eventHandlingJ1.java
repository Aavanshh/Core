import java.applet.*;
import javax.swing.*;

import javafx.event.ActionEvent;

import java.awt.*;
import java.awt.event.*;

public class eventHandlingJ1 extends JApplet implements ActionListener{

    JButton b;
    JTextField tf;

    public void init(){
        tf=new JTextField();
        tf.setBounds(30,40,150,20);

        b=new JButton("click");
        b.setBounds(80,150,70,40);

        add(b);
        add(tf);

        b.addActionListener(this);

        setLayout(null);
    }

    // public void actionPerformed(ActionEvent e){
    //     tf.setText("Rishabh");
    // }

    public void actionPerformed(ActionEvent e){  
tf.setText("Welcome");  
}  
    
}

/*<applet code="eventHandlingJ.class" width="300" height="300">  
</applet>   */
