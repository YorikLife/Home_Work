package Tests.Home_Work1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task4_1_test {
    @Test
    public void Even_numbers() {
        int a = 16;
        int b = 11;
        boolean result;
        result = Home_Work1.task_4_1.EvenNumber(a, b);
        Assertions.assertTrue(result);
    }
}





