
package Lab_19;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // Функция для чтения содержимого текстового файла и сохранения его в список строк
    public static List<String> readFromFile(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void main(String[] args) {
        // Пример использования функции для чтения из текстового файла
        String filePath = "/Users/nersiarnak/Documents/ProjectJava/text.txt"; // Укажите путь к вашему текстовому файлу
        List<String> fileContent = readFromFile(filePath);

        // Вывод первых 5 строк из файла
        System.out.println("First 5 lines from the file:");
        for (int i = 0; i < Math.min(5, fileContent.size()); i++) {
            System.out.println(fileContent.get(i));
        }
        // Создание объекта GenericArrayHolder и получение элемента по индексу
        GenericArrayHolder<Double> doubleArrayHolder = new GenericArrayHolder<>(new Double[]{1.1, 2.2, 3.3, 4.4, 5.5});
        double elementAtIndex = doubleArrayHolder.getElementAtIndex(2);
        System.out.println("Element at index 2: " + elementAtIndex);

    }
}

