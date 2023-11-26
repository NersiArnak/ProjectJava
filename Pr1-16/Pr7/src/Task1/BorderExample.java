import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BorderExample extends JFrame {
    JPanel[] pnl = new JPanel[12]; // Создание массива панелей

    public BorderExample() {
        setLayout(new GridLayout(3, 4)); // Установка сетки с 3 строками и 4 столбцами для компоновки

        for (int i = 0; i < pnl.length; i++) {
            // Генерация случайного значения для компонента цвета
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);

            pnl[i] = new JPanel(); // Создание новой панели
            pnl[i].setBackground(new Color(r, g, b)); // Задание цвета фона панели
            add(pnl[i]); // Добавление панели на форму
        }

        pnl[4].setLayout(new BorderLayout()); // Установка Borderlayout для пятой панели
        pnl[4].add(new JButton("one"), BorderLayout.WEST); // Добавление кнопки на западную сторону пятой панели
        pnl[4].add(new JButton("two"), BorderLayout.EAST); // Добавление кнопки на восточную сторону пятой панели
        pnl[4].add(new JButton("three"), BorderLayout.SOUTH); // Добавление кнопки на южную сторону пятой панели
        pnl[4].add(new JButton("four"), BorderLayout.NORTH); // Добавление кнопки на северную сторону пятой панели
        pnl[4].add(new JButton("five"), BorderLayout.CENTER); // Добавление кнопки в центр пятой панели

        pnl[10].setLayout(new FlowLayout()); // Установка FlowLayout для одиннадцатой панели
        pnl[10].add(new JButton("one")); // Добавление кнопки на одиннадцатую панель
        pnl[10].add(new JButton("two")); // Добавление кнопки на одиннадцатую панель
        pnl[10].add(new JButton("three")); // Добавление кнопки на одиннадцатую панель
        pnl[10].add(new JButton("four")); // Добавление кнопки на одиннадцатую панель
        pnl[10].add(new JButton("five")); // Добавление кнопки на одиннадцатую панель

        setSize(800, 500); // Установка размеров окна
    }

    public static void main(String[] args) {
        new BorderExample().setVisible(true); // Создание экземпляра BorderExample и отображение окна
    }
}