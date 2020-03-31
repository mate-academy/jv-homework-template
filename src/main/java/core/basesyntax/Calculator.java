package core.basesyntax;

public class Calculator {
    public double calculate(double num1, double num2, char operation) {
        if (operation == '+') {
            return num1 + num2;
        }
        if (operation == '-') {
            return num1 - num2;
        }
        if (operation == '*') {
            return num1 * num2;
        }
        if (operation == '/') {
            return num1 / num2;
        }
        if (operation == '^') {
            return Math.pow(num1, num2);
        }
        throw new IllegalArgumentException();
    }

}
