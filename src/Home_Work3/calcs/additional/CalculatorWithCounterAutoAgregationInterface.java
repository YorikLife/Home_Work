package Home_Work3.calcs.additional;

import Home_Work3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    private long count1 = 0;
    private long count2 = 0;
    private long count3 = 0;
    ICalculator calculator1;
    ICalculator calculator2;
    ICalculator calculator3;
    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator1 = calculator;
        this.calculator2 = calculator;
        this.calculator3 = calculator;
    }

    public void incrementCount1() {
        this.count1++;
    }
    public void incrementCount2() {
        this.count2++;
    }
    public void incrementCount3() {
        this.count3++;
    }

    public double multiply1(double a, double b) {
        incrementCount1();
        return calculator1.multiply(a, b);
    }

    public double divide1(double a, double b) {
        incrementCount1();
        return calculator1.divide(a, b);
    }

    public double sum1(double a, double b) {
        incrementCount1();
        return calculator1.sum(a, b);
    }

    public double subtraction1(double a, double b) {
        incrementCount1();
        return calculator1.subtraction(a, b);
    }

    public double sqrt1(double a) {
        incrementCount1();
        return calculator1.sqrt(a);
    }

    public double exponential1(double a, double b) {
        incrementCount1();
        return calculator1.exponential(a, b);
    }

    public double module1(double a) {
        incrementCount1();
        return calculator1.module(a);
    }


    public double multiply2(double a, double b) {
        incrementCount2();
        return calculator2.multiply(a, b);
    }

    public double divide2(double a, double b) {
        incrementCount2();
        return calculator2.divide(a, b);
    }

    public double sum2(double a, double b) {
        incrementCount2();
        return calculator2.sum(a, b);
    }

    public double subtraction2(double a, double b) {
        incrementCount2();
        return calculator2.subtraction(a, b);
    }

    public double sqrt2(double a) {
        incrementCount2();
        return calculator2.sqrt(a);
    }

    public double exponential2(double a, double b) {
        incrementCount2();
        return calculator2.exponential(a, b);
    }

    public double module2(double a) {
        incrementCount2();
        return calculator2.module(a);
    }

    public double multiply3(double a, double b) {
        incrementCount3();
        return calculator3.multiply(a, b);
    }

    public double divide3(double a, double b) {
        incrementCount3();
        return calculator3.divide(a, b);
    }

    public double sum3(double a, double b) {
        incrementCount3();
        return calculator3.sum(a, b);
    }

    public double subtraction3(double a, double b) {
        incrementCount3();
        return calculator3.subtraction(a, b);
    }

    public double sqrt3(double a) {
        incrementCount3();
        return calculator3.sqrt(a);
    }

    public double exponential3(double a, double b) {
        incrementCount3();
        return calculator3.exponential(a, b);
    }

    public double module3(double a) {
        incrementCount3();
        return calculator3.module(a);
    }


    public long getCount1() {
        return this.count1;
    }
    public long getCount2() {
        return this.count2;
    }
    public long getCount3() {
        return this.count3;
    }
}
