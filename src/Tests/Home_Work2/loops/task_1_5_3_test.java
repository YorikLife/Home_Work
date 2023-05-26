package Tests.Home_Work2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_1_5_3_test {
    @Test
    public void evens() {
    String number = "41"; // число, из которого идет вычисление
    int actual = 2; // одна четная цифра + одна нечетная
    int expected = Home_Work_2.loops.task_1_5_3.EvenOdds();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void evens2() {
        String number = "2"; // число, из которого идет вычисление
        int actual = 1; // одна четная цифра
        int expected = Home_Work_2.loops.task_1_5_3.EvenOdds2();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void evens3() {
        String number = "11"; // число, из которого идет вычисление
        int actual = 2; // два нечетных
        int expected = Home_Work_2.loops.task_1_5_3.EvenOdds3();
        Assertions.assertEquals(expected, actual);
    }
}
