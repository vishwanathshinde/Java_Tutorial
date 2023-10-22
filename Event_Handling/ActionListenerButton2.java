import java.awt.*;
import java.awt.event.*;

public class ActionListenerButton2 extends Frame implements ActionListener {
    Button r,g,b;
    ActionListenerButton2() {
        r = new Button("Red");
        g = new Button("Green");
        b = new Button("Blue");
        add(r);
        add(g);
        add(b);

        r.addActionListener(this);
        g.addActionListener(this);
        b.addActionListener(this);

        setLayout(new FlowLayout());
        setSize(350,350);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == r){
            setBackground(Color.red);
        }
        else if(ae.getSource() == g) {
            setBackground(Color.green);
        }
        else {
            setBackground(Color.blue);
        }
    }
    public static void main(String[] args){
        new ActionListenerButton2();
    }
}