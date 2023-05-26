package Tests.Home_Work2.loops;

import Home_Work_2.loops.task_1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_1_2_test {
    @Test
    public void values() {
    int number = 181232375; // умножаемое число
    int expected = 10080; // ожидаемый результат
    int actual =  task_1_2.numberOfvalue(number);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void values2() {
        int number = 181232355; // умножаемое число изменил последние 2 цифры
        int expected = 7200; // ожидаемый результат
        int actual = task_1_2.numberOfvalue2(number);
        Assertions.assertEquals(expected, actual);
    }
}
