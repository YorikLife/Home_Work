package Home_Work3.calcs.simple;

import Home_Work3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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
        double result = 0;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
            return result;
    }

    public double module(double a) {
            if (a < 0) {
                return a * (-1);
            }
            return a;
    }
}

