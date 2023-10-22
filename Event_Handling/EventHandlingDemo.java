import java.awt.*;
import java.awt.event.*;

public class EventHandlingDemo extends Frame implements ActionListener {
    TextField tf;
    EventHandlingDemo() {
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click me");
        Button b2 = new Button("Hold me");
        b.setBounds(100,120,80,30);
        b2.setBounds(140,160,80,30);
        b.addActionListener(this);
        add(b);
        add(b2);
        add(tf);
        setSize(300,300);
        setVisible(true);
        setLayout(null);
        setTitle("Event in same class");

        // Event handling for closing the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae){
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        new EventHandlingDemo();
    }
}