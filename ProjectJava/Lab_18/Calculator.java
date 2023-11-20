package Lab_18;
public class Calculator {
    public static <T extends Number, V extends Number> double sum(T num1, V num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T num1, V num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T num1, V num2) {
        if (num2.doubleValue() != 0) {
            return num1.doubleValue() / num2.doubleValue();
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
    }

    public static <T extends Number, V extends Number> double subtract(T num1, V num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
}

