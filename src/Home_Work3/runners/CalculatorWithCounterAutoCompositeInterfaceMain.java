package Home_Work3.runners;

import Home_Work3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import Home_Work3.calcs.simple.CalculatorWithMathCopy;
import Home_Work3.calcs.simple.CalculatorWithMathExtends;
import Home_Work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregationInterface calculator1 = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        CalculatorWithCounterAutoAgregationInterface calculator2 = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoAgregationInterface calculator3 = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());

        calculator1.incrementCount1();
        System.out.println("Результат выражения : " + calculator1.sum1(4.1, calculator1.sum1(calculator1.multiply1(15, 7), calculator1.exponential1(calculator1.divide1(28, 5), 2))));//109.1
        System.out.println("Количество раз использования калькулятора : " + calculator1.getCount1());


        calculator2.incrementCount2();
        System.out.println("Результат выражения : " + calculator2.sum2(4.1, calculator2.sum2(calculator2.multiply2(15, 7), calculator2.exponential2(calculator2.divide2(28, 5), 2))));//140.45999999999998
        System.out.println("Количество раз использования калькулятора : " + calculator2.getCount2());

        calculator3.incrementCount3();
        System.out.println("Результат выражения : " + calculator3.sum3(4.1, calculator3.sum3(calculator3.multiply3(15, 7), calculator3.exponential3(calculator3.divide3(28, 5), 2))));//140.45999999999998
        System.out.println("Количество раз использования калькулятора : " + calculator3.getCount3());
    }
}
