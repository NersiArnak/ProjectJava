import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Replacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите новую информацию для замены в файле:");
        String newContent = scanner.nextLine();

        String filePath = "C:\\Users\\arnon\\IdeaProjects\\Project13\\src\\Proba.txt";

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String tempFilePath = "C:\\Users\\arnon\\IdeaProjects\\Project13\\src\\TempProba.txt";
            FileWriter tempFileWriter = new FileWriter(tempFilePath);
            BufferedWriter tempBufferedWriter = new BufferedWriter(tempFileWriter);

            String line;
            boolean replaced = false;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("Заменить эту строку")) {
                    tempBufferedWriter.write(newContent);
                    replaced = true;
                } else {
                    tempBufferedWriter.write(line);
                }
                tempBufferedWriter.newLine();
            }

            bufferedReader.close();
            fileReader.close();
            tempBufferedWriter.close();
            tempFileWriter.close();

            if (replaced) {
                if (new File(filePath).delete()) {
                    new File(tempFilePath).renameTo(new File(filePath));
                    System.out.println("Информация успешно заменена в файле.");
                } else {
                    System.out.println("Не удалось удалить исходный файл.");
                }
            } else {
                System.out.println("Информация для замены не найдена в файле.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при замене информации в файле.");
        }
    }
}
