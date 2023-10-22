import java.awt.*;
import java.awt.event.*;

public class ItemListenerDemo extends Frame implements ItemListener {
    Checkbox cb1, cb2;
    Label l1;
    ItemListenerDemo() {
        cb1 = new Checkbox("Happy");
        cb2 = new Checkbox("Sad");
        l1 = new Label();

        cb1.addItemListener(this);
        cb2.addItemListener(this);

        add(cb1);
        add(cb2);
        add(l1);

        setLayout(new FlowLayout());
        setSize(220,150);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie){
        Checkbox ch = (Checkbox)ie.getItemSelectable();
        if(ch.getState()==true) {
            l1.setText(ch.getLabel() + " is checked");
        }
        else {
            l1.setText(ch.getLabel() + " is unchecked");
        }
    }
    public static void main(String[] args){
        new ItemListenerDemo();
    }
}