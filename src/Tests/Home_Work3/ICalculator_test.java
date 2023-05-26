package Tests.Home_Work3;

import Home_Work3.calcs.api.ICalculator;
import Home_Work3.calcs.simple.CalculatorWithMathCopy;
import Home_Work3.calcs.simple.CalculatorWithMathExtends;
import Home_Work3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ICalculator_test {

    ICalculator calculator = new CalculatorWithOperator();
    ICalculator calculator1 = new CalculatorWithMathExtends();
    ICalculator calculator2 = new CalculatorWithMathCopy();
    @Test
    public void multiply() {
        double actual = 27.3;
        double expected = calculator.multiply(3.5, 7.8);
        assertEquals(expected, actual);
    }
}


