import java.awt.*;

public class BorderLayoutDemo extends Frame {
    BorderLayoutDemo() {

        setLayout(new BorderLayout());
        add("North", new Button("north"));
        add("South", new Button("south"));
        add("East", new Button("easty"));
        add("West", new Button("west"));
        add("Center", new Button("center"));
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args){
        new BorderLayoutDemo();
    }
}