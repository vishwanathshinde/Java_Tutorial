import java.awt.*;

public class RadioButtonDemo extends Frame {
    RadioButtonDemo() {
        CheckboxGroup cg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("First", cg, false);
        Checkbox cb2 = new Checkbox("Second", cg, false);
        Checkbox cb3 = new Checkbox("Third", cg, false);
        add(cb1);
        add(cb2);
        add(cb3);

        TextArea ta = new TextArea("Hello World !", 1,20);
        add(ta);    

        TextField tf = new TextField("Good Morning",20);
        add(tf);

        Choice ch = new Choice();
        ch.addItem("Apple");
        ch.addItem("Banana");
        ch.addItem("Peru");
        ch.addItem("Ananas");
        add(ch);

        List l = new List(2);
        l.add("one");
        l.add("two");
        l.add("three");
        l.add("four");
        l.add("five");
        l.add("five");
        l.add("five");
        l.add("five");
        add(l);

        Scrollbar sb = new Scrollbar(Scrollbar.VERTICAL,10,60,100,500);
        add(sb, BorderLayout.EAST);

        setSize(300,300);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        RadioButtonDemo obj = new RadioButtonDemo();
    }
}