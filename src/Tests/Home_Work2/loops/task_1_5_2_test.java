package Tests.Home_Work2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_1_5_2_test {
    @Test
    public void randoms() {
        int random = Home_Work_2.loops.task_1_5_2.Random();
        int maxValue = 1000;
        Assertions.assertTrue(random<maxValue);
    }

    @Test
    public void randoms2() {
        int random = Home_Work_2.loops.task_1_5_2.Random2();
        int lowValue = 1;
        Assertions.assertTrue(random>lowValue);
    }
}
