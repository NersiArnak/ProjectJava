import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyMouse extends JFrame {
    JLabel lbl = new JLabel("");

    public MyMouse() {
        super("Dude! Where's my mouse ?"); // Заголовок окна

        setSize(400, 200); // Установка размеров окна

        setLayout(new BorderLayout()); // Установка BorderLayout для компоновки элементов

        add(lbl, BorderLayout.SOUTH); // Добавление метки lbl в нюжную часть окна

        addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {} // Неиспользуемое событие

            public void mouseClicked(MouseEvent a) {
                lbl.setText("X=" + a.getX() + " Y=" + a.getY()); // Обработка события клика мыши, установка текста метки lbl с координатами клика
            }

            public void mouseEntered(MouseEvent a) {} // Неиспользуемое событие

            public void mouseReleased(MouseEvent a) {} // Неиспользуемое событие

            public void mousePressed(MouseEvent a) {} // Неиспользуемое событие
        });
    }

    public static void main(String[] args) {
        new MyMouse().setVisible(true); // Создание экземпляра MyMouse и отображение окна
    }
}