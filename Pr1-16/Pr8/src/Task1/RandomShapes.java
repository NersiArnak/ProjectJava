import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = getRandomColor();
    }

    protected Color getRandomColor() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        return new Color(red, green, blue);
    }

    abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 2 * radius, 2 * radius);
    }
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

public class RandomShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                for (int i = 0; i < 20; i++) {
                    int x = new Random().nextInt(700);
                    int y = new Random().nextInt(500);

                    if (i % 2 == 0) {
                        Shape circle = new Circle(x, y, 50);
                        circle.draw(g);
                    } else {
                        Shape rectangle = new Rectangle(x, y, 100, 60);
                        rectangle.draw(g);
                    }
                }
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
