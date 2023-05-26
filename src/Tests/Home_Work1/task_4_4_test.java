package Tests.Home_Work1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_4_4_test {
    @Test
    public void Kbytes() {
        int x = 100;
        int y = 1024;
        int result = Home_Work1.task_4_4.bytes(x,y);

        int a = 102400;
        int b = 2147483647;
        boolean result1 = a < b;
        Assertions.assertTrue(result1);
    }
}
