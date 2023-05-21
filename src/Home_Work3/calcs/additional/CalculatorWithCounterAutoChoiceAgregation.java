package Home_Work3.calcs.additional;

import Home_Work3.calcs.simple.CalculatorWithMathCopy;
import Home_Work3.calcs.simple.CalculatorWithMathExtends;
import Home_Work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;
    private long counts1 = 0;
    private long counts2 = 0;
    private long counts3 = 0;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {
        this.calculator1 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {
        this.calculator2 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) {
        this.calculator3 = calculator;
    }

    public void incrementCounts1() {
        this.counts1++;
    }
    public void incrementCounts2() {
        this.counts2++;
    }
    public void incrementCounts3() {
        this.counts3++;
    }

    public double multiply1(double a, double b) {
        incrementCounts1();
        return calculator1.multiply(a, b);
    }

    public double divide1(double a, double b) {
        incrementCounts1();
        return calculator1.divide(a, b);
    }

    public double sum1(double a, double b) {
        incrementCounts1();
        return calculator1.sum(a, b);
    }

    public double subtraction1(double a, double b) {
        incrementCounts1();
        return calculator1.subtraction(a, b);
    }

    public double sqrt1(double a) {
        incrementCounts1();
        return calculator1.sqrt(a);
    }

    public double exponential1(double a, double b) {
        incrementCounts1();
        return calculator1.exponential(a, b);
    }

    public double module1(double a) {
        incrementCounts1();
        return calculator1.module(a);
    }



    public long getCounts1() {
        return this.counts1;
    }


    public double multiply2(double a, double b) {
        incrementCounts2();
        return calculator2.multiply(a, b);
    }

    public double divide2(double a, double b) {
        incrementCounts2();
        return calculator2.divide(a, b);
    }

    public double sum2(double a, double b) {
        incrementCounts2();
        return calculator2.sum(a, b);
    }

    public double subtraction2(double a, double b) {
        incrementCounts2();
        return calculator2.subtraction(a, b);
    }

    public double sqrt2(double a) {
        incrementCounts2();
        return calculator2.sqrt(a);
    }

    public double exponential2(double a, double b) {
        incrementCounts2();
        return calculator2.exponential(a, b);
    }

    public double module2(double a) {
        incrementCounts2();
        return calculator2.module(a);
    }

    public long getCounts2() {
        return this.counts2;
    }


    public double multiply3(double a, double b) {
        incrementCounts3();
        return calculator3.multiply(a, b);
    }

    public double divide3(double a, double b) {
        incrementCounts3();
        return calculator3.divide(a, b);
    }

    public double sum3(double a, double b) {
        incrementCounts3();
        return calculator3.sum(a, b);
    }

    public double subtraction3(double a, double b) {
        incrementCounts3();
        return calculator3.subtraction(a, b);
    }

    public double sqrt3(double a) {
        incrementCounts3();
        return calculator3.sqrt(a);
    }

    public double exponential3(double a, double b) {
        incrementCounts3();
        return calculator3.exponential(a, b);
    }

    public double module3(double a) {
        incrementCounts3();
        return calculator3.module(a);
    }

    public long getCounts3() {
        return this.counts3;
    }
}

