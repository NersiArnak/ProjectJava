package Task2;

import java.util.ArrayList;
import java.util.List;

public class SortingStudentsByGPA {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.8));
        students.add(new Student("Bob", 3.9));
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("David", 4.0));
        students.add(new Student("Eve", 3.7));

        System.out.println("Before sorting:");
        printStudents(students);

        // Сортировка списка студентов по итоговым баллам (GPA) методом быстрой сортировки
        quickSort(students, 0, students.size() - 1);

        System.out.println("\nAfter sorting:");
        printStudents(students);
    }

    public static void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    public static int partition(List<Student> students, int low, int high) {
        double pivot = students.get(high).getGPA();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (students.get(j).getGPA() >= pivot) {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, high);
        return i + 1;
    }

    public static void swap(List<Student> students, int i, int j) {
        Student temp = students.get(i);
        students.set(i, students.get(j));
        students.set(j, temp);
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}



