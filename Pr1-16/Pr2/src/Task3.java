public class Task3 {
    public static void main(String[] args) {
        int n = 10; // Количество чисел для вывода
        double sum = 0.0; // Переменная для суммы

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; // Добавляем очередной член ряда к сумме
            System.out.println("Число " + i + ": " + sum);
        }
    }
}
