import javax.swing.*;
import java.awt.FlowLayout;


public class MenuExample {
    MenuExample() {
        JFrame jf = new JFrame();

        JMenuBar mb = new JMenuBar();
        jf.setJMenuBar(mb);

        JMenu menu = new JMenu("Menu");
        mb.add(menu);

        JMenuItem i1 = new JMenuItem("item 1");
        JMenuItem i2 = new JMenuItem("item 2");
        JMenuItem i3 = new JMenuItem("item 3");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        JMenu submenu = new JMenu("Sub menu");
        JMenuItem i4 = new JMenuItem("item 4");
        JMenuItem i5 = new JMenuItem("item 5");

        menu.add(submenu);
        submenu.add(i4);
        submenu.add(i5);
        

        JButton b1 = new JButton("hii");
        jf.add(b1);
        JButton b2 = new JButton("hii");
        jf.add(b2);

        jf.setSize(400,400);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
    }

    public static void main(String[] args){
        MenuExample obj = new MenuExample();
    }
}