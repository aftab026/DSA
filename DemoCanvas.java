import java.awt.*;

class CanvasDemo extends Canvas {
    public CanvasDemo() {
        setBackground(Color.WHITE);
        setSize(300, 200);
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(80, 80, 150, 75);
    }
}

class DemoCanvas {
    DemoCanvas() {
        Frame f = new Frame();
        f.add(new CanvasDemo());
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new DemoCanvas();

    }

}
