public class Task5 {
    public static void main(String[] args) {
        int number = 5; // Число, для которого нужно вычислить факториал

        long factorial = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен: " + factorial);
    }

    // Метод для вычисления факториала числа с помощью цикла
    private static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}