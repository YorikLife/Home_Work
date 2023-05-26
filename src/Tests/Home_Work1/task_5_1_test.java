package Tests.Home_Work1;

import Home_Work1.Task_5_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_5_1_test {
    @Test

    public void weekend() {
    boolean week = false;
    boolean vacation = true;
    boolean result = Task_5_1.SleepIn(false,true);
        Assertions.assertEquals(false,week);
    }
}
