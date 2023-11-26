package Pr21;

import java.util.Arrays;

public class ArrayQueueModuleTest {
    public static void main(String[] args) {
        ArrayQueueModule<Integer> queue = new ArrayQueueModule<>(); // Создание объекта очереди для целых чисел
        fillQueue(queue); // Заполнение очереди
        dump(queue); // Вывод элементов очереди
        fillQueue(queue); // Добавление новых элементов
        clear(queue); // Очистка очереди
        fillQueue(queue); // Заполнение очереди заново
        getArray(queue); // Получение массива из очереди
    }

    public static void fillQueue(ArrayQueueModule<Integer> queue) {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
    }

    public static void getArray(ArrayQueueModule<Integer> queue) {
        Object[] arr = queue.toArray();
        Integer[] intArray = Arrays.copyOf(arr, arr.length, Integer[].class);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    public static void dump(ArrayQueueModule<Integer> queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.size() + " " + queue.element() + " " + queue.dequeue());
        }
    }

    public static void clear(ArrayQueueModule<Integer> queue) {
        queue.clear();
        System.out.println(queue.isEmpty());
    }
}
