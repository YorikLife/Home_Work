package Home_Work3.runners;

import Home_Work3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import Home_Work3.calcs.simple.CalculatorWithMathCopy;
import Home_Work3.calcs.simple.CalculatorWithMathExtends;
import Home_Work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());

        calculator1.incrementCounts1();
        System.out.println("Результат выражения : " + calculator1.sum1(4.1, calculator1.sum1(calculator1.multiply1(15, 7), calculator1.exponential1(calculator1.divide1(28,5),2 ))));//109.1
        System.out.println("Количество раз использования калькулятора : " + calculator1.getCounts1());


        calculator2.incrementCounts2();
        System.out.println("Результат выражения : " + calculator2.sum2(4.1, calculator2.sum2(calculator2.multiply2(15, 7), calculator2.exponential2(calculator2.divide2(28,5),2 ))));//140.45999999999998
        System.out.println("Количество раз использования калькулятора : " + calculator2.getCounts2());

        calculator3.incrementCounts3();
        System.out.println("Результат выражения : " + calculator3.sum3(4.1, calculator3.sum3(calculator3.multiply3(15, 7), calculator3.exponential3(calculator3.divide3(28,5),2 ))));//140.45999999999998
        System.out.println("Количество раз использования калькулятора : " + calculator3.getCounts3());
    }
}

