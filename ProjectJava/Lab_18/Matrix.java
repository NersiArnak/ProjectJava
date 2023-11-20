package Lab_18;
public class Matrix<T> {
    private T[][] matrix;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public void printMatrix() {
        for (T[] row : matrix) {
            for (T item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
