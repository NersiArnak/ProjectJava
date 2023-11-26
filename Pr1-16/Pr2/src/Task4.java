import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int size = 10; // Размер массива

        // Генерация и вывод массива
        int[] array = generateRandomArray(size);
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // Сортировка массива
        Arrays.sort(array);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    // Метод для генерации массива целых чисел случайным образом
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Генерация случайного числа от 0 до 99
        }

        return array;
    }
}
