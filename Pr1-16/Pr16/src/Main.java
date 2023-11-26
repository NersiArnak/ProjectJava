import javax.management.Query;

public class Main {
    public static void main(String[] args) throws Exception {
        Exception1 obj = new Exception1();
        obj.exceptionDemo();
        Exception2 pp = new Exception2();
        pp.exceptionDemo2();

        // Обработка исключений с помощью блока try-catch
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.getKey(); // Запускаем программу, вызывая метод getKey()
    }
}