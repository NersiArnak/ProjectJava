import java.awt.*;               // Импорт класса для работы с графическим интерфейсом
import java.awt.event.*;         // Импорт классов для обработки событий
import javax.swing.*;            // Импорт классов для создания графического интерфейса

class TextAreaExample extends JFrame {             // Определение класса TextAreaExample, наследующего JFrame
    JTextArea jta1 = new JTextArea(10, 25);        // Создание экземпляра JTextArea с размером 10 строк и 25 столбцов
    JButton button = new JButton("Add some Text"); // Создание экземпляра кнопки JButton с надписью "Add some Text"
    JScrollPane scrollPane = new JScrollPane(jta1);

    public TextAreaExample() {                     // Конструктор класса TextAreaExample
        super("Example");                           // Вызов конструктора суперкласса JFrame с параметром "Example"
        setSize(300, 300);                          // Установка размера окна
        setLayout(new FlowLayout());                 // Установка менеджера компоновки FlowLayout для расположения элементов

                                          // Добавление компонента JTextArea в окно
        add(button);                                // Добавление кнопки в окно
        add(scrollPane);

        button.addActionListener(new ActionListener() {  // Добавление слушателя ActionListener к кнопке
            public void actionPerformed(ActionEvent ae) {
                String txt = JOptionPane.showInputDialog(null, "Insert some text");  // Вывод диалогового окна с запросом на ввод текста
                jta1.append(txt);                       // Добавление введенного текста в JTextArea
            }
        });
    }

    public static void main(String[] args) {         // Точка входа в программу
        new TextAreaExample().setVisible(true);      // Создание экземпляра класса TextAreaExample и установка его видимости
    }
}