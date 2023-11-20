package Lab_15;
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
        controller.setStudentName("Дима");
        controller.setStudentRollNo("567");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        // Логика получения данных о студенте из базы данных
        return new Student();
    }
}
