package Pr18;
// Обобщенный класс Matrix с параметром типа T
public class Matrix<T> {
    // Поле класса для хранения двумерного массива объектов типа T
    private T[][] matrix;

    // Конструктор класса, принимающий двумерный массив объектов типа T
    public Matrix(T[][] matrix) {
        this.matrix = matrix; // Инициализация поля класса
    }

    // Метод для печати элементов матрицы
    public void printMatrix() {
        for (T[] row : matrix) { // Итерация по строкам матрицы
            for (T item : row) { // Итерация по элементам строки
                System.out.print(item + " "); // Вывод элемента с пробелом
            }
            System.out.println(); // Переход на новую строку после каждой строки матрицы
        }
    }
}
