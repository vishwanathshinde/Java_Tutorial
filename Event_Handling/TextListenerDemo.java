import java.awt.*;
import java.awt.event.*;

public class TextListenerDemo extends Frame implements TextListener {
    Label l1, l2;
    TextField tf;
    String str;
    TextListenerDemo() {
        l1 = new Label("Type in the textfield, to see the textevents it generates - ", Label.CENTER);
        l2 = new Label();
        tf = new TextField(25);

        add(l1);
        add(tf);
        add(l2);

        tf.addTextListener(this);

        setLayout(new FlowLayout());
        setSize(340,300);
        setVisible(true);
    }
    public void textValueChanged(TextEvent te){
        l2.setText(te.paramString());
    }
    public static void main(String[] args){
        new TextListenerDemo();
    }
}