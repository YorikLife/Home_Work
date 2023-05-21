package Home_Work3.runners;

import Home_Work3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends expression = new CalculatorWithMathExtends();
        System.out.println("Результат выражения : " + expression.sum(4.1, expression.sum(expression.multiply(15, 7), expression.exponential(expression.divide(28,5),2 ))));//140.45999999999998
    }
}
