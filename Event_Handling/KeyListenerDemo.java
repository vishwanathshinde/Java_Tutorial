import java.awt.*;
import java.awt.event.*;

public class KeyListenerDemo implements KeyListener {
    Label l1, l2;
    TextField tf;
    Frame jf;
    String str;
    KeyListenerDemo() {
        jf = new Frame("Handling KeyEvent");
        l1 = new Label("Press any key on keyboard, to see event it generates -", l1.CENTER);
        l2 = new Label();
        tf = new TextField(20);
        tf.addKeyListener(this);

        jf.add(l1);
        jf.add(tf);
        jf.add(l2);

        jf.setLayout(new FlowLayout());
        jf.setSize(300,300);
        jf.setVisible(true);
    }
    public void keyPressed(KeyEvent ke){
        str="KeyCode : " + ke.getKeyCode() + ", -key pressed- ";
        l2.setText(str);
        jf.setVisible(true);
    }
    public void keyReleased(KeyEvent ke){
        str += " -key released-";  
        l2.setText(str);
        jf.setVisible(true);
    }
    public void keyTyped(KeyEvent ke){
        str += " -key typed-"; 
        l2.setText(str);
        jf.setVisible(true);
    }
    public static void main(String[] args){
        new KeyListenerDemo();
    }
}