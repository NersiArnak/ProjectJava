package Pr20;

public class CalculatorTest {

    public static void main(String[] args) {

        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
        testDivisionByZero();
        testInvalidToken();
        testEmptyStack();
    }


    public static void testAddition() {
        CalculatorModel model = new CalculatorModel();
        model.performOperation(5, 7, "+");
        double result = model.getResult();
        assert result == 12 : "Тест на сложение не пройден";
    }


    public static void testSubtraction() {
        CalculatorModel model = new CalculatorModel();
        model.performOperation(10, 3, "-");
        double result = model.getResult();
        assert result == 7 : "Тест на вычитание не пройден";
    }


    public static void testMultiplication() {
        CalculatorModel model = new CalculatorModel();
        model.performOperation(4, 6, "*");
        double result = model.getResult();
        assert result == 24 : "Тест на умножение не пройден";
    }


    public static void testDivision() {
        CalculatorModel model = new CalculatorModel();
        model.performOperation(15, 3, "/");
        double result = model.getResult();
        assert result == 5 : "Тест на деление не пройден";
    }


    public static void testDivisionByZero() {
        CalculatorModel model = new CalculatorModel();
        model.performOperation(10, 0, "/");
        double result = model.getResult();
        assert Double.isNaN(result) : "Тест на деление на ноль не пройден";
    }


    public static void testInvalidToken() {
        CalculatorModel model = new CalculatorModel();
        model.performOperation(5, 3, "#"); // Неверный оператор
        double result = model.getResult();
        assert Double.isNaN(result) : "Тест на неверный оператор не пройден";
    }


    public static void testEmptyStack() {
        CalculatorModel model = new CalculatorModel();
        model.performOperation(5, 3, "+"); // Добавление числа без операции
        double result = model.getResult();
        assert Double.isNaN(result) : "Тест на пустой стек не пройден";
    }
}
