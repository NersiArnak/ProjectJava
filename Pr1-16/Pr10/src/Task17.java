import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        System.out.println("Введите значения (Для выхода - 0): ");
        while(true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            else {
                if (num > max) {
                    max = num;
                }
            }
        }
        System.out.println("Максимальное значение: " +  max);
    }
}
