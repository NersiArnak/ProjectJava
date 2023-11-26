package Task1;
//вставками
import java.util.Arrays;
public class TestStudentSorting {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(123, "Alice"),
                new Student(456, "Bob"),
                new Student(789, "Charlie"),
                new Student(234, "David"),
                new Student(567, "Eve")
        };

        System.out.println("Before sorting:");
        printStudents(students);

        // Сортировка массива студентов по iDNumber методом сортировки вставками
        insertionSort(students);

        System.out.println("\nAfter sorting:");
        printStudents(students);
    }

    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}


