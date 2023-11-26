package Pr15;
public class MVCPatternDemo {
    public static void main(String[] args) {
        // Получаем студента из базы данных
        Student model = retriveStudentFromDatabase();

        // Создаем представление и контроллер
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // Обновляем представление с информацией о студенте
        controller.updateView();

        // Обновляем модель и затем представление
        controller.setStudentName("Иван");
        controller.setStudentRollNo("832");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        // Логика получения данных о студенте из базы данных
        return new Student();
    }
}
