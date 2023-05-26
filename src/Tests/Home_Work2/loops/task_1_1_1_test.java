package Tests.Home_Work2.loops;

import Home_Work_2.loops.task_1_1_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_1_1_1_test {
    @Test
    public void test_task_1_1_1(){
    long fact = 15;
    long expected = task_1_1_1.fact11();
    long actual = 1307674368000l;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test111() {
        long fact = 12;
        long expected = task_1_1_1.fact111();
        long actual = 479001600l;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test1111() {
        long result = 5;
        long expected = task_1_1_1.fact1111();
        long actual = 6538371840000l;
        Assertions.assertEquals(expected, actual);
    }
}
