import java.awt.*;
import java.awt.event.*;

public class MouseListenerDemo extends Frame implements MouseListener {
    Label l1, l2;
    String str;
    MouseListenerDemo() {
        l1 = new Label("Handling mouse events in the frame window", Label.CENTER);
        l2 = new Label();
        setLayout(new FlowLayout());
        add(l1);
        add(l2);

        addMouseListener(this);

        setSize(340,200);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent me){
        str += " and mouse button was clicked";
        l2.setText(str);
    }
    public void mouseEntered(MouseEvent me){
        l2.setText("Mouse has entered the window area");
    }
    public void mouseExited(MouseEvent me){
        l2.setText("Mouse has exited the window area");
    }
    public void mousePressed(MouseEvent me){
        l2.setText("Mouse button is being pressed");
    }
    public void mouseReleased(MouseEvent me){
        str = "Mouse button is released";
        l2.setText(str);
    }
    public static void main(String[] args){
        new MouseListenerDemo();
    }
}