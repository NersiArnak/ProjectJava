import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для записи в файл:");
        String textToWrite = scanner.nextLine();

        // Укажите путь к файлу
        String filePath = "C:\\Users\\arnon\\IdeaProjects\\Project13\\src\\Proba.txt";

        try {
            // Создаем объект FileWriter с указанием пути к файлу
            FileWriter fileWriter = new FileWriter(filePath);

            // Создаем объект BufferedWriter для более эффективной записи
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Записываем введенный текст в файл
            bufferedWriter.write(textToWrite);

            // Закрываем BufferedWriter и FileWriter, чтобы сохранить изменения
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при записи в файл.");
        }
    }
}
