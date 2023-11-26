import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NullLayout extends JFrame {
    JButton but1 = new JButton("One");; // Создание кнопки с надписью "One"
    JButton but2 = new JButton("two");; // Создание кнопки с надписью "two"
    JButton but3 = new JButton("three");; // Создание кнопки с надписью "three"

    public NullLayout() {
        super("pepsi");
        setLayout(null); // Установка NullLayout

        but1.setBounds(150, 300, 100, 20); // Установка координат и размеров для кнопки but1 (150, 300, width=100, height=20)

        but2.setSize(80, 400); // Установка размеров для кнопки but2 (width=80, height=400)
        but2.setLocation(0, 0); // Установка координат для кнопки but2 (0, 0)

        but3.setLocation(300, 100); // Установка координат для кнопки but3 (300, 100)
        but3.setSize(200, 75); // Установка размеров для кнопки but3 (width=200, height=75)
        // Можно объединить эти два шага в один вызов метода setBounds

        add(but1); // Добавление кнопки but1 на форму
        add(but2); // Добавление кнопки but2 на форму
        add(but3); // Добавление кнопки but3 на форму

        setSize(500, 500); // Установка размеров окна
    }

    public static void main(String[] args) {
        new NullLayout().setVisible(true); // Создание экземпляра NullLayout и отображение окна
    }
}