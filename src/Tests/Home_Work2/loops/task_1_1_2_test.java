package Tests.Home_Work2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class task_1_1_2_test {
    @Test
    public void testRec() {
    int number = 5; // переменная, которая умножается.
    boolean expected;
        expected = Home_Work_2.loops.task_1_1_2.Recursive();
        assertTrue(expected); // 120
    }

    @Test
    public void testRec2() {
         int number2 = 3; // переменная, которая умножается.
         boolean expected;
         expected = Home_Work_2.loops.task_1_1_2.Recursive2();
         Assertions.assertTrue(expected); // 6
    }
}

