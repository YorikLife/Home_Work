package Tests.Home_Work3;

import Home_Work3.calcs.api.ICalculator;
import Home_Work3.calcs.simple.CalculatorWithMathCopy;
import Home_Work3.calcs.simple.CalculatorWithMathExtends;
import Home_Work3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ICalculator_test {

    ICalculator calculator1 = new CalculatorWithOperator();
    ICalculator calculator2 = new CalculatorWithMathExtends();
    ICalculator calculator3 = new CalculatorWithMathCopy();
    @Test
    public void multiply() {
        double actual = 27.3;
        double expected = calculator1.multiply(3.5, 7.8);
        assertEquals(expected, actual);
    }

    @Test
    public void multiply2() {
        double actual = 27.3;
        double expected = calculator2.multiply(3.5, 7.8);
        assertEquals(expected, actual);
    }
    @Test
    public void multiply3() {
        double actual = 27.3;
        double expected = calculator3.multiply(3.5, 7.8);
        assertEquals(expected, actual);
    }

    @Test
    public void divide() {
        double actual = 7.5;
        double expected = calculator1.divide(15, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divide2() {
        double actual = 7.5;
        double expected = calculator2.divide(15, 2);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void divide3() {
        double actual = 7.5;
        double expected = calculator3.divide(15, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sum() {
        double actual = 17;
        double expected = calculator1.sum(15, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sum2() {
        double actual = 17;
        double expected = calculator2.sum(15, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sum3() {
        double actual = 17;
        double expected = calculator3.sum(15, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void subtraction() {
        double actual = 13;
        double expected = calculator1.subtraction(15, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void subtraction2() {
        double actual = 13;
        double expected = calculator2.subtraction(15, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void subtraction3() {
        double actual = 13;
        double expected = calculator3.subtraction(15, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrt() {
        double actual = 4;
        double expected = calculator1.sqrt(16);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrt2() {
        double actual = 4;
        double expected = calculator2.sqrt(16);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrt3() {
        double actual = 4;
        double expected = calculator3.sqrt(16);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void exponential() {
        double actual = 9;
        double expected = calculator1.exponential(3, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void exponential2() {
        double actual = 9;
        double expected = calculator2.exponential(3, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void exponential3() {
        double actual = 9;
        double expected = calculator3.exponential(3, 2);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void module() {
        double actual = 5;
        double expected = calculator1.module(-5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void module2() {
        double actual = 5;
        double expected = calculator2.module(-5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void module3() {
        double actual = 5;
        double expected = calculator3.module(-5);
        Assertions.assertEquals(expected, actual);
    }
}


