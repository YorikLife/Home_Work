package Home_Work3.calcs.additional;

import Home_Work3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
   public long count = 0;
   public void incrementCountOperation() {
        count++;
   }
   public long getCountOperation () {
        return count;
   }
}
