package Tests.Home_Work2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_1_5_4_test {
    @Test
    public void Fib() {
    int number = 5; // число, от котрого идет выражение
    String expected = "1 2 3 5 8 13"; // ожидаемый результат
    String actual = Home_Work_2.loops.task_1_5_4.FibValue();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Fib2() {
        String expected = "1 2 3 5"; // ожидаемый результат
        String actual = Home_Work_2.loops.task_1_5_4.FibValue2();
        Assertions.assertEquals(expected, actual);
    }
}
