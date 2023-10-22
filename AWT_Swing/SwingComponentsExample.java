import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingComponentsExample extends JFrame implements ItemListener{
    TextField tf;
    SwingComponentsExample(){
        tf = new TextField("Hello my dear World !", 40);
        add(tf);

        JCheckBox cb1 = new JCheckBox("First",false);
        JCheckBox cb2 = new JCheckBox("First",false);
        JCheckBox cb3 = new JCheckBox("First",false);

        cb1.addItemListener(this);

        add(cb1);
        add(cb2);
        add(cb3);

        JRadioButton rb1 = new JRadioButton("First",false);
        JRadioButton rb2 = new JRadioButton("Second",false);
        JRadioButton rb3 = new JRadioButton("Third",false);
        add(rb1);
        add(rb2);
        add(rb3);

        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);

        JComboBox jcb = new JComboBox();
        jcb.addItem("JAVA");
        jcb.addItem("CPP");
        jcb.addItem("Python");
        jcb.addItem("html");

        add(jcb);

        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent ie){
        JCheckBox cb = (JCheckBox)ie.getItem();
        tf.setText(cb.getText());
    }

    public static void main(String[] args){
        new SwingComponentsExample();
    }
}