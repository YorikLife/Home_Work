package Home_Work3.calcs.additional;

import Home_Work3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    private CalculatorWithMathCopy calculators;
    private long counters = 0;
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculators) {
        this.calculators = calculators;
    }
    public void incrementCounters() {
        this.counters++;
    }

    public double multiply(double a, double b) {
        incrementCounters();
        return calculators.multiply(a, b);
    }

    public double divide(double a, double b) {
        incrementCounters();
        return calculators.divide(a, b);
    }

    public double sum(double a, double b) {
        incrementCounters();
        return calculators.sum(a, b);
    }

    public double subtraction(double a, double b) {
        incrementCounters();
        return calculators.subtraction(a, b);
    }

    public double sqrt(double a) {
        incrementCounters();
        return calculators.sqrt(a);
    }

    public double exponential(double a, double b) {
        incrementCounters();
        return calculators.exponential(a, b);
    }

    public double module(double a) {
        incrementCounters();
        return calculators.module(a);
    }

    public long getCounters() {
        return this.counters;
    }
}
