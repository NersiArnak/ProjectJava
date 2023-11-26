import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EndofFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для добавления в файл:");
        String textToAdd = scanner.nextLine();

        // Укажите путь к файлу, в который вы хотите добавить текст
        String filePath = "C:\\Users\\arnon\\IdeaProjects\\Project13\\src\\Proba.txt";

        try {
            // Создаем объект FileWriter с указанием файла и флага append (true)
            FileWriter fileWriter = new FileWriter(filePath, true);

            // Записываем введенный текст в конец файла
            fileWriter.write(textToAdd);
            fileWriter.write(System.lineSeparator()); // Добавляем перенос строки, чтобы текст не склеивался

            // Закрываем FileWriter
            fileWriter.close();

            System.out.println("Текст успешно добавлен в файл.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при добавлении текста в файл.");
        }
    }
}
