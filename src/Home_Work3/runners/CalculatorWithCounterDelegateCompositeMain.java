package Home_Work3.runners;

import Home_Work3.calcs.additional.CalculatorWithCounterAutoComposite;


public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();
        calculator.incrementCounts();
        System.out.println("Результат выражения : " + calculator.sum(4.1, calculator.sum(calculator.multiply(15, 7), calculator.exponential(calculator.divide(28,5),2 ))));//140.45999999999998
        System.out.println("Количество раз использования калькулятора : " + calculator.getCounts());
    }
}
