import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int count = 0;

        System.out.println("Вводите значения (Для выхода - 0): ");
        while(true) {
            int num = scanner.nextInt(); // считвывание числа
            if (num == 0) {
                break;
            }
            if (num > max) {
                max = num;
                count = 1;
            }
            else if (num == max) {
                count++;
            }

        }

        System.out.println("Совпадений: "+count);
    }
}
