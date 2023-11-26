import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageDisplay {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Пожалуйста, укажите путь к изображению в аргументах командной строки.");
            return;
        }

        String imagePath = args[0];

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Отображение изображения");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    BufferedImage image;
                    try {
                        image = ImageIO.read(new File(imagePath));
                        g.drawImage(image, 0, 0, this);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}