package Home_Work3.calcs.additional;

import Home_Work3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    public long countOperations = 0;
    public void incrementCountOperations(){
        countOperations++;
    }
    public long getcountOperations () {
        return countOperations;
    }

    @Override
    public double sqrt(double a) {
        return super.sqrt(a);
    }

    @Override
    public double exponential(double a, double b) {
        return super.exponential(a, b);
    }

    @Override
    public double module(double a) {
        return super.module(a);
    }

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

    public void count() {
    }

    public void countOperations() {
    }
}
