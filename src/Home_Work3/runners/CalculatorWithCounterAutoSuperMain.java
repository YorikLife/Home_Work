package Home_Work3.runners;

import Home_Work3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper expression = new CalculatorWithCounterAutoSuper();
        expression.incrementCountOperations();
        System.out.println("Результат выражения : " + expression.sum(4.1, expression.sum(expression.multiply(15, 7), expression.exponential(expression.divide(28,5),2 ))));//140.45999999999998
        System.out.println("Количество раз использования калькулятора : " + expression.getcountOperations());
    }
}
