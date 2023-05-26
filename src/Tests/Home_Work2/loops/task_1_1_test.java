package Tests.Home_Work2.loops;

import Home_Work_2.loops.task_1_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_1_1_test {
    @Test
    public void factorial() {
    int number1 = 120;
    int expected = number1;
    long actual = task_1_1.factorials();
        Assertions.assertEquals(expected, actual);
    }

@Test
    public void testfactorial() {
    long factorial = 2;
    int expected = 240;
    int actual = (int) task_1_1.factorialtest1();
    Assertions.assertEquals(expected, actual);
    }

}
