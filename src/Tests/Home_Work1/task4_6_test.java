package Tests.Home_Work1;

import Home_Work1.task_4_6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task4_6_test {
    @Test
    public void year() {
    int b = 2004;
    int result = task_4_6.Year();
        Assertions.assertEquals(b,result);
    }
}
