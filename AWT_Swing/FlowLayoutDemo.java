import java.awt.*;
import java.awt.event.*;

public class FlowLayoutDemo extends Frame {
    FlowLayoutDemo() {
        Label l1 = new Label("Enter your name: ");
        TextField tf1 = new TextField(25);
        Label l2 = new Label("Enter your city: ");
        TextField tf2 = new TextField(25);
        Button b1 = new Button("Submit Details");
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        setTitle("FlowLayoutDemo");
        setSize(400,150);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args){
        FlowLayoutDemo obj = new FlowLayoutDemo();
    }
}