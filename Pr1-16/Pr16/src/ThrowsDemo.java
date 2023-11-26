import java.util.Scanner;
// демонстрирует механизм обработки и проброса исключений с использованием try, catch и throws,
// а также позволяет пользователю вводить ключ и обрабатывает исключения при валидации и обработке ключа.
public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            try {
                String key = myScanner.nextLine(); // Используйте nextLine() для считывания строки, включая пустую строку
                if (key.trim().isEmpty()) { // Проверьте, является ли введенная строка пустой после удаления начальных и конечных пробелов
                    throw new Exception("Key cannot be empty"); // Выбросьте исключение, если ключ пустой
                }
                printDetails(key);
                validInput = true;
            } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
                System.out.println("Please try again: ");
            }
        }
    }

    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key); // Вызываем метод getDetails с введенным ключом
            System.out.println(message); // Выводим сообщение
        } catch (Exception e) {
            throw e; // Если возникло исключение, пробрасываем его дальше
        }
    }

    private static String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to an empty string"); // Если ключ пустой, выбрасываем исключение
        }
        return "data for " + key; // Иначе возвращаем сообщение с ключом
    }
}