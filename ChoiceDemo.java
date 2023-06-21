import java.awt.*;
public class ChoiceDemo {
    ChoiceDemo(){
        Frame f = new Frame();
        // Choice c = new Choice();
        List c = new List(6);
        c.setBounds(80,80,100,100);
        c.add("Green");
        c.add("Black");
        c.add("White");
        c.add("Pink");
        c.add("Yellow");
        c.add("Red");
        f.add(c);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new ChoiceDemo();
        
    }
    
}
