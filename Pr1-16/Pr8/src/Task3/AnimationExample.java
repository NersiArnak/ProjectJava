package Task3;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class AnimationExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AnimationPanel panel = new AnimationPanel();
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);

        // Запустить анимацию
        panel.startAnimation();
    }
}

class AnimationPanel extends JPanel {
    private static final int FRAME_COUNT = 2; // Количество кадров анимации
    private static final int FRAME_DELAY = 1000; // Задержка между кадрами (в миллисекундах)
    private BufferedImage[] frames; // Массив с кадрами
    private int currentFrame = 0; // Текущий кадр

    public AnimationPanel() {
        // Загрузка кадров анимации
        frames = new BufferedImage[FRAME_COUNT];
        frames[0] = loadImage("C:\\Users\\arnon\\IdeaProjects\\Project 8\\src\\Task3\\Снимок экрана 2023-10-20 132403.png");
        frames[1] = loadImage("C:\\Users\\arnon\\IdeaProjects\\Project 8\\src\\Task3\\Снимок экрана 2023-10-20 132331.png");
    }

    public void startAnimation() {
        // Запуск таймера для обновления кадров
        Timer timer = new Timer(FRAME_DELAY, e -> {
            currentFrame = (currentFrame + 1) % FRAME_COUNT;
            repaint(); // Перерисовать панель
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (frames[currentFrame] != null) {
            g.drawImage(frames[currentFrame], 0, 0, this);
        }
    }

    private BufferedImage loadImage(String imagePath) {
        try {
            return ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
