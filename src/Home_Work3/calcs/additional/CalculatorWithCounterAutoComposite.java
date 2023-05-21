package Home_Work3.calcs.additional;

import Home_Work3.calcs.simple.CalculatorWithMathCopy;
public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        public long counts = 0;

        public void incrementCounts() {
            this.counts++;
        }

        public double multiply(double a, double b) {
            incrementCounts();
            return calculator.multiply(a, b);
        }

        public double divide(double a, double b) {
            incrementCounts();
            return calculator.divide(a, b);
        }

        public double sum(double a, double b) {
            incrementCounts();
            return calculator.sum(a, b);
        }

        public double subtraction(double a, double b) {
            incrementCounts();
            return calculator.subtraction(a, b);
        }

        public double sqrt(double a) {
            incrementCounts();
            return calculator.sqrt(a);
        }

        public double exponential(double a, double b) {
            incrementCounts();
            return calculator.exponential(a, b);
        }

        public double module(double a) {
            incrementCounts();
            return calculator.module(a);
        }

        public long getCounts() {
            return this.counts;
    }
}


