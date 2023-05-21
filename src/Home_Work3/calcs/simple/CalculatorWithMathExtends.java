package Home_Work3.calcs.simple;


import Home_Work3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double multiply(double a, double b) {
        return super.multiply(a, b);
    }

    @Override
    public double divide(double a, double b) {
        return super.divide(a, b);
    }

    @Override
    public double sum(double a, double b) {
        return super.sum(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        return super.subtraction(a, b);
    }

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double exponential(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double module(double a) {
        return Math.abs(a);
    }
}
