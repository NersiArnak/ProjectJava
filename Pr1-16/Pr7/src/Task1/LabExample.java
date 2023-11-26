import java.awt.*; // Импорт пакета java.awt для использования GUI-компонентов
import java.awt.event.*; // Импорт пакета java.awt.event для обработки событий
import javax.swing.*; // Импорт пакета javax.swing для использования расширенных GUI-компонентов

class LabExample extends JFrame { // Объявление класса LabExample, который расширяет класс JFrame
    JTextField jta1 = new JTextField(10); // Создание текстового поля jta1 с шириной 10 символов
    JTextField jta2 = new JTextField(10); // Создание текстового поля jta2 с шириной 10 символов
    JButton button = new JButton("Add them up"); // Создание кнопки с названием "Add them up"
    Font fnt = new Font("Times new roman", Font.BOLD, 20); // Создание нового объекта Font с параметрами шрифта

    LabExample() { // Конструктор класса LabExample
        super("Example"); // Вызов конструктора суперкласса JFrame с заголовком "Example"
        setLayout(new FlowLayout()); // Задание менеджера компоновки FlowLayout для окна

        setSize(250, 150); // Задание размеров окна

        add(new JLabel("1st Number")); // Добавление метки "1st Number" на окно
        add(jta1); // Добавление текстового поля jta1 на окно
        add(new JLabel("2nd Number")); // Добавление метки "2nd Number" на окно
        add(jta2); // Добавление текстового поля jta2 на окно
        add(button); // Добавление кнопки на окно

        button.addActionListener(new ActionListener() { // Добавление слушателя действий к кнопке
            public void actionPerformed(ActionEvent ae) { // Обработчик события нажатия на кнопку
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim()); // Получение значения из текстового поля jta1 и преобразование в тип double
                    double x2 = Double.parseDouble(jta2.getText().trim()); // Получение значения из текстового поля jta2 и преобразование в тип double

                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE); // Вывод сообщения с результатом сложения x1 и x2
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE); // Вывод сообщения об ошибке при некорректном вводе чисел
                }
            }
        });

        setVisible(true); // Установка видимости окна
    }

    public static void main(String[] args) {
        new LabExample(); // Создание экземпляра класса LabExample
    }
}