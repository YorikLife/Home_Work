package Home_Work3.runners;

import Home_Work3.calcs.additional.CalculatorWithCounterAutoAgregation;
import Home_Work3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        calculator.incrementCounters();
        System.out.println("Результат выражения : " + calculator.sum(4.1, calculator.sum(calculator.multiply(15, 7), calculator.exponential(calculator.divide(28,5),2 ))));//140.45999999999998
        System.out.println("Количество раз использования калькулятора : " + calculator.getCounters());
    }
}
