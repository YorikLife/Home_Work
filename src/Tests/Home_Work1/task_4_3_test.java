package Tests.Home_Work1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_4_3_test {
    @Test
    public void Divisible() {
        int x = 10;
        int y = 2;
        int a = 11;
        int b = 2;
        boolean result1 = Home_Work1.task_4_3.getDivisibile(a, b);
        boolean result = Home_Work1.task_4_3.getDivisibile(x,y);
        Assertions.assertTrue(result);
        Assertions.assertFalse(result1);
    }
}
