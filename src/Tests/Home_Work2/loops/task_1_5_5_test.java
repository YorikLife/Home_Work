package Tests.Home_Work2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_1_5_5_test {
    @Test
    public void Step() {
        int number1 = 10; // число, от которого начинается диапозон
        int number2 = 50; // число, на котором диапозон заканчивается
        String actual = Home_Work_2.loops.task_1_5_5.StepInts();
        String excepted = "10 15 20 25 30 35 40 45 50"; // ожидаемый результат
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void Step2() {
        int number1 = 10; // число, от которого начинается диапозон
        int number2 = 30; // число, на котором диапозон заканчивается
        String actual = Home_Work_2.loops.task_1_5_5.StepInts2();
        String excepted = "10 15 20 25 30"; // ожидаемый результат
        Assertions.assertEquals(excepted, actual);
    }
}
