import java.awt.*;
import java.awt.event.*;

public class WindowAdapterDemo extends Frame {
    WindowAdapterDemo() {
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                dispose();
            }
        });
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new WindowAdapterDemo();
    }
}