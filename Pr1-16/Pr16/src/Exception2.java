import java.util.Scanner;
public class Exception2 {
    public void exceptionDemo2() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            System.out.println("Этот блок выполняется всегда, независимо от исключений.");
        }
    }
}