package Tests.Home_Work1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_7_test {
    @Test
    public void PhoneNumbers() {
        int[] PhoneNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String expected = "(123) 456-7890";
        String actual = Home_Work1.task_7.PhoneNumber();
        Assertions.assertEquals(expected, actual);
    }
}
