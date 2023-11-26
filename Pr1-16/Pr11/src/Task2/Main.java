package Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 3.8));
        students.add(new Student("Bob", 3.9));
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("David", 4.0));
        students.add(new Student("Eve", 3.7));

        // Создаем экземпляр SortingStudentsByGPA
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        // Вызываем метод quickSort для сортировки списка студентов
        sorter.quickSort(students, 0, students.size() - 1);

        // Выводим отсортированный список
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGPA());
        }
    }
}
