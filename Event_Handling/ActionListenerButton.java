import java.awt.*;
import java.awt.event.*;

public class ActionListenerButton extends Frame implements ActionListener {
    TextField tf;
    Button b1, b2;
    ActionListenerButton(){
        tf = new TextField("Hello World");
        tf.setBounds(100,100,100,20);

        b1 = new Button("Button 1");
        b1.setBounds(125,150,50,20);
        b1.addActionListener(this);

        b2 = new Button("Button 2");
        b2.setBounds(125,180,50,20);
        b2.addActionListener(this);

        add(tf);
        add(b1);
        add(b2);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setTitle("Action Listener on Button");
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            tf.setText(b1.getLabel());
        }
        if(ae.getActionCommand()== "Button 2") {
            tf.setText(b2.getLabel());
        }
    }

    public static void main(String[] args) {
        new ActionListenerButton();
    }
}