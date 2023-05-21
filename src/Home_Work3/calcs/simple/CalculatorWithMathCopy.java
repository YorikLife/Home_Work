package Home_Work3.calcs.simple;

import Home_Work3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }


    public double exponential(double a, double b) {
        return Math.pow(a,b);
    }


    public double module(double a) {
        return Math.abs(a);
    }
}
