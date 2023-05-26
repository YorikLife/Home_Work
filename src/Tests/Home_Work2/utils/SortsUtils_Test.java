package Tests.Home_Work2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortsUtils_Test {
    int[] test1 = {7,3,26,11,44};
    int[] test2 = {5,14,28,10,7};
    int[] test3 = {2,44,3,18,31};

    @Test
    public void sortArrays() {
        int[] actual = test1;
        int[] expected = Home_Work_2.utils.SortsUtils.sort(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sortArrays2() {
        int[] actual = test2;
        int[] expected = Home_Work_2.utils.SortsUtils.sort(actual);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void sortArrays3() {
        int[] actual = test3;
        int[] expected = Home_Work_2.utils.SortsUtils.sort(actual);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shakeArrays() {
        int[] actual = test1;
        int[] expected = Home_Work_2.utils.SortsUtils.shake(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shakeArrays2() {
        int[] actual = test2;
        int[] expected = Home_Work_2.utils.SortsUtils.shake(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shakeArrays3() {
        int[] actual = test3;
        int[] expected = Home_Work_2.utils.SortsUtils.shake(actual);
        Assertions.assertEquals(expected, actual);
    }
}
