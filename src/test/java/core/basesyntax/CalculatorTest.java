package core.basesyntax;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = null;
    @Before
    public void beforeMethod() {
        calculator = new Calculator();
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIllegalArg() {
        double number1 = 2.1;
        double number2 = 3.5;
        double expected = number1 + number2;
        double actual = calculator.calculate(number1, number2, '3');
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void checkCorrectPositive() {
        double number1 = 3.5;
        double number2 = 5.1;
        double expected = number1 + number2;
        double actual = calculator.calculate(number1, number2, '+');
        Assert.assertEquals(actual, expected, 0);
        expected = number1 - number2;
        actual = calculator.calculate(number1, number2, '-');
        Assert.assertEquals(actual, expected, 0);
        expected = number1 * number2;
        actual = calculator.calculate(number1, number2, '*');
        Assert.assertEquals(actual, expected, 0);
        expected = number1 / number2;
        actual = calculator.calculate(number1, number2, '/');
        Assert.assertEquals(actual, expected, 0);
        expected = Math.pow(number1, number2);
        actual = calculator.calculate(number1, number2, '^');
        Assert.assertEquals(actual, expected, 0);
    }

    @Test
    public void checkCorrectNegative() {
        double number1 = -Math.random();
        double number2 = -Math.random();
        double expected = number1 + number2;
        double actual = calculator.calculate(number1, number2, '+');
        Assert.assertEquals(actual, expected, 0);
        expected = number1 - number2;
        actual = calculator.calculate(number1, number2, '-');
        Assert.assertEquals(actual, expected, 0);
        expected = number1 * number2;
        actual = calculator.calculate(number1, number2, '*');
        Assert.assertEquals(actual, expected, 0);
        expected = number1 / number2;
        actual = calculator.calculate(number1, number2, '/');
        Assert.assertEquals(actual, expected, 0);
        expected = Math.pow(number1, number2);
        actual = calculator.calculate(number1, number2, '^');
        Assert.assertEquals(actual, expected, 0);
    }

    @Test
    public void checkOperationWithZero() {
        double number1 = 5.1;
        double number2 = 0;
        double expected = number1 + number2;
        double actual = calculator.calculate(number1, number2, '+');
        Assert.assertEquals(actual, expected, 0);
        expected = number1 - number2;
        actual = calculator.calculate(number1, number2, '-');
        Assert.assertEquals(actual, expected, 0);
        expected = number1 * number2;
        actual = calculator.calculate(number1, number2, '*');
        Assert.assertEquals(actual, expected, 0);
        expected = number1 / number2;
        actual = calculator.calculate(number1, number2, '/');
        Assert.assertEquals(actual, expected, 0);
        expected = Math.pow(number1, number2);
        actual = calculator.calculate(number1, number2, '^');
        Assert.assertEquals(actual, expected, 0);
    }

    @Test(expected = NullPointerException.class)
    public void CheckNullPointer() {
        Double number1 = 1.0;
        Double number2 = null;
        Double actual = calculator.calculate(number1, number2, '^');
    }
}
