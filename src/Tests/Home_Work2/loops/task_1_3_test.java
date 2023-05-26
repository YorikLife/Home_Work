package Tests.Home_Work2.loops;

import Home_Work_2.loops.task_1_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_1_3_test {
    @Test
    public void power() {
    double number1 = 5.0; // число, которое возводят
    double number2 = 5.0; // число, на сколько возводят
    double actual = task_1_3.pows(number1,number2 );
    double expected = 3125.0; // ожидаемый результат
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void power2() {
        double result = 2; // изменил даный параметр на +1
        double number1 = 5.0; // число, которое возводят
        double number2 = 5.0; // число, на сколько возводят
        double actual = task_1_3.pows2(number1,number2);
        double expected = 6250.0; // ожидаемый результат
        Assertions.assertEquals(expected, actual);
    }
}
