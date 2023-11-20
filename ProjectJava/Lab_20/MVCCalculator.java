package Lab_20;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Model
class CalculatorModel {
    private double result;

    public void performOperation(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    result = Double.NaN; // Возвращаем NaN в случае деления на 0
                }
                break;
        }
    }

    public double getResult() {
        return result;
    }
}

// View
class CalculatorView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JTextField secondNumber = new JTextField(10);
    private JLabel resultLabel = new JLabel("Результат:");
    private JTextField result = new JTextField(10);
    private JButton addButton = new JButton("+");
    private JButton subtractButton = new JButton("-");
    private JButton multiplyButton = new JButton("*");
    private JButton divideButton = new JButton("/");

    public CalculatorView() {
        JPanel panel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);

        panel.add(firstNumber);
        panel.add(secondNumber);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(resultLabel);
        panel.add(result);

        this.add(panel);
    }

    public double getFirstNumber() {
        return Double.parseDouble(firstNumber.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumber.getText());
    }

    public void setResult(double calculatedResult) {
        if (Double.isNaN(calculatedResult)) {
            result.setText("Ошибка: Деление на ноль");
        } else {
            result.setText(String.valueOf(calculatedResult));
        }
    }

    void addCalculationListener(ActionListener listenForCalcButton) {
        addButton.addActionListener(listenForCalcButton);
        subtractButton.addActionListener(listenForCalcButton);
        multiplyButton.addActionListener(listenForCalcButton);
        divideButton.addActionListener(listenForCalcButton);
    }
}

// Controller
class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double firstNumber, secondNumber;
            String operator = e.getActionCommand();

            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.performOperation(firstNumber, secondNumber, operator);
                theView.setResult(theModel.getResult());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Введите числа");
            }
        }
    }
}

public class MVCCalculator {
    public static void main(String[] args) {
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        CalculatorController theController = new CalculatorController(theView, theModel);

        theView.setVisible(true);
    }
}

