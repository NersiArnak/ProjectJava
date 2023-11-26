import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
    public static void main(String[] args) {
        // Укажите путь к файлу, который вы хотите прочитать
        String filePath = "C:\\Users\\arnon\\IdeaProjects\\Project13\\src\\Proba.txt";

        try {
            // Создаем объект FileReader для чтения файла
            FileReader fileReader = new FileReader(filePath);

            // Создаем объект BufferedReader для более эффективного чтения
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            // Читаем и выводим содержимое файла построчно
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Закрываем BufferedReader и FileReader
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при чтении файла.");
        }
    }
}
