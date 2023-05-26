package Tests.Home_Work2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_1_5_6_test {
    @Test
    public void reverse() {
    int values = 5228;
    String expected = "8 82 822 8225";
    String actual = Home_Work_2.loops.task_1_5_6.reverseValues();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverse2() {
        int values = 8456;
        String expected = "6 65 654 6548";
        String actual = Home_Work_2.loops.task_1_5_6.reverseValues2();
        Assertions.assertEquals(expected, actual);
    }
}
