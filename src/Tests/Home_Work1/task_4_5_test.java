package Tests.Home_Work1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_4_5_test {
    @Test
    public void CheckLetter() {
    char t = 75;
    char result = Home_Work1.task_4_5.charCode(t);
        Assertions.assertEquals(result, t);
    }
}
