package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test(expected = IllegalArgumentException.class)
    public void checkIllegalArg() {
        double number1 = Math.random();
        double number2 = Math.random();
        double expected = number1 + number2;
        double actual = calculator.calculate(number1, number2, '3');
        Assert.assertEquals(expected, actual, 0);
        expected = number1 - number2;
        actual = calculator.calculate(number1, number2, '3');
        Assert.assertEquals(expected, actual, 0);
        expected = number1 * number2;
        actual = calculator.calculate(number1, number2, 'b');
        Assert.assertEquals(expected, actual, 0);
        expected = number1 / number2;
        actual = calculator.calculate(number1, number2, '.');
        Assert.assertEquals(expected, actual, 0);
        expected = Math.pow(number1, number2);
        actual = calculator.calculate(number1, number2, '<');
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void checkNotCorrectOperation() {
        double number1 = Math.random();
        double number2 = Math.random();
        double expected = number1 * number2;
        double actual = calculator.calculate(number1, number2, '/');
        Assert.assertNotEquals(expected, actual);
        expected = number1 + number2;
        actual = calculator.calculate(number1, number2, '*');
        Assert.assertNotEquals(actual, expected);
        expected = number1 + number2;
        actual = calculator.calculate(number1, number2, '/');
        Assert.assertNotEquals(actual, expected);
        expected = number1 + number2;
        actual = calculator.calculate(number1, number2, '-');
        Assert.assertNotEquals(actual, expected);
        expected = number1 / number2;
        actual = calculator.calculate(number1, number2, '*');
        Assert.assertNotEquals(actual, expected);
        expected = number1 - number2;
        actual = calculator.calculate(number1, number2, '*');
        Assert.assertNotEquals(actual, expected);
        expected = number1 - number2;
        actual = calculator.calculate(number1, number2, '/');
        Assert.assertNotEquals(actual, expected);
        expected = Math.pow(number1, number2);
        actual = calculator.calculate(number1, number2, '/');
        Assert.assertNotEquals(actual, expected);
        expected = Math.pow(number1, number2);
        actual = calculator.calculate(number1, number2, '/');
        Assert.assertNotEquals(actual, expected);
        expected = Math.pow(number1, number2);
        actual = calculator.calculate(number1, number2, '*');
        Assert.assertNotEquals(actual, expected);
        expected = Math.pow(number1, number2);
        actual = calculator.calculate(number1, number2, '+');
        Assert.assertNotEquals(actual, expected);
        expected = Math.pow(number1, number2);
        actual = calculator.calculate(number1, number2, '-');
        Assert.assertNotEquals(actual, expected);
        expected = number1 - number2;
        actual = calculator.calculate(number1, number2, '^');
        Assert.assertNotEquals(actual, expected);
        expected = number1 + number2;
        actual = calculator.calculate(number1, number2, '^');
        Assert.assertNotEquals(actual, expected);
    }

    @Test
    public void checkCorrect() {
        double number1 = Math.random();
        double number2 = Math.random();
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
        number1 = -Math.random();
        number2 = -Math.random();
        expected = number1 + number2;
        actual = calculator.calculate(number1, number2, '+');
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
        double number1 = Math.random();
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

    @Test
    public void CheckNullPointer() {
        Double number1 = null;
        Double number2 = null;

    }
}