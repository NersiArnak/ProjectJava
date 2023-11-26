package Pr20;

import java.util.Stack;

public class RPNCalculator {
    public static double calculate(String expression) {
        // Разделение строки на токены (
        String[] tokens = expression.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (token.matches("-?\\d+(\\.\\d+)?")) {
                stack.push(Double.parseDouble(token));
            } else if (token.matches("[+\\-*/]")) {
                if (stack.size() < 2) {

                    System.out.println("Ошибка: Недостаточно операндов для оператора");
                    return Double.MIN_VALUE;
                } else {
                    // Извлечение двух последних операндов из стека
                    double operand2 = stack.pop();
                    double operand1 = stack.pop();
                    // Выполнение операции и запись результата в стек
                    double result = performOperation(token, operand1, operand2);
                    stack.push(result);
                }
            } else {

                System.out.println("Ошибка: Недопустимый токен");
                return Double.MIN_VALUE;
            }
        }

        if (stack.size() == 1) {
            return stack.pop();
        } else {

            System.out.println("Ошибка: Некорректное количество операторов и операндов");
            return Double.MIN_VALUE;
        }
    }

    // Метод для выполнения операции между двумя операндами в зависимости от оператора
    private static double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {

                    System.out.println("Ошибка: Деление на ноль");
                    return Double.MIN_VALUE;
                }
                return operand1 / operand2;
            default:

                return Double.MIN_VALUE;
        }
    }

    public static void main(String[] args) {

        String expression = "3 4 + 2 *";
        double result = calculate(expression); // Вычисление выражения
        if (result != Double.MIN_VALUE) {
            // Вывод результата вычисления
            System.out.println("Результат вычисления выражения '" + expression + "' = " + result);
        }
    }
}
