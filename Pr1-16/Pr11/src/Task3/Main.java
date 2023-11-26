package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student(1, "Alice"));
        students1.add(new Student(2, "Bob"));
        students1.add(new Student(3, "Charlie"));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student(5, "Eve"));
        students2.add(new Student(4, "David"));


        // Вызов сортировки и объединения
        List<Student> sortedStudents = MergeSortStudents.mergeSort(students1, students2);

        // Вывод отсортированного списка
        for (Student student : sortedStudents) {
            System.out.println(student.getID() + ": " + student.getName());
        }
    }
}
