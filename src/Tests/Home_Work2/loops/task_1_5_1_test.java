package Tests.Home_Work2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_1_5_1_test {
    @Test
    public void maxValue() {
    int value = 789; // число, от которого идет подсчет
    int numbers = 9; // старшее число значения
    int actual = numbers;
    int expected = Home_Work_2.loops.task_1_5_1.maxValues();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxValue2() {
        int value = 888; // число, от которого идет подсчет
        int numbers = 8; // старшее число значения
        int actual = numbers;
        int expected = Home_Work_2.loops.task_1_5_1.maxValues2();
        Assertions.assertEquals(expected, actual);
    }
}
