import java.awt.*;
public class LabelDemo {
    public static void main(String[] args) {
        Frame f = new Frame("LableDemo");
        Label lb1 = new Label("Welcome to Advance Java");
        lb1.setBounds(50,50,200,30);
        Label lb2 = new Label("AWT Classes");
        lb2.setBounds(50,100,200,30);
        f.add(lb1);
        f.add(lb2);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

    }
    
}
