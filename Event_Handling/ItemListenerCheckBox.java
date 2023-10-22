import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ItemListenerCheckBox extends JFrame {
    JCheckBox net, php, java;
    JTextField msg;
    private String s1=" ", s2=" ", s3=" ";

    public ItemListenerCheckBox(){
        net = new JCheckBox("net");
        php = new JCheckBox("php");
        java = new JCheckBox("java");
        msg = new JTextField("30");

        CheckBoxHandler cbh = new CheckBoxHandler();

        net.addItemListener(cbh);
        php.addItemListener(cbh);
        java.addItemListener(cbh);

        add(net);
        add(php);
        add(java);
        add(msg);

        setLayout(new FlowLayout());
        setSize(500,100);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    } 
    class CheckBoxHandler implements ItemListener {
        public void itemStateChanged(ItemEvent ie){
            if(ie.getSource() == net){
                if(ie.getStateChange()==ItemEvent.SELECTED)
                    s1="NET";
                else
                    s1=" ";
            }
            if(ie.getSource() == php){
                if(ie.getStateChange()==ItemEvent.SELECTED)
                    s2="PHP";
                else
                    s2=" ";
            }
            if(ie.getSource() == java){
                if(ie.getStateChange()==ItemEvent.SELECTED)
                    s3="JAVA";
                else
                    s3=" ";
            }
            msg.setText(s1+s2+s3);
        }
    }
    public static void main(String[] args){
        new ItemListenerCheckBox();
    }
}