import java.awt.*;

public class ComponentsDemo {
    ComponentsDemo(){
        Frame frame = new Frame();

        Label l1 = new Label("Hello World");
        //l1.setAlignment(2);
        l1.setText("Text Changed");
        frame.add(l1);
        System.out.println(l1.getAlignment());
        Button b = new Button("Click Me");
        frame.add(b);

        Checkbox cb1 = new Checkbox("I am you", true);
        frame.add(cb1);

        frame.setSize(400,400);
        frame.setTitle("First Program");
        frame.setVisible(true);
        //frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    public static void main(String [] args) {
        ComponentsDemo obj = new ComponentsDemo();
    }
}