package Tests.Home_Work2.arrays;

import Home_Work_2.arrays.task_2_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class task_2_4_test {
    private static int[] test1 = {7,19,28,46,27};
    private static int[] test2 = {6,19,24,16,98};
    private static int[] test3 = {7,39,22,16,67,31,54,62,78};

    @Test
    public void test241() {
    int[] container = test1;
    int actual = 74;
    int expected = task_2_4.arr2_4_1(container);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test2412() {
        int[] container = test2;
        int actual = 144;
        int expected = task_2_4.arr2_4_1(container);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test2413() {
        int[] container = test3;
        int actual = 232;
        int expected = task_2_4.arr2_4_1(container);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test242() {
        int[] container = test2;
        int expected = task_2_4.arr2_4_2(container);
        int actual = 98;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test2422() {
        int[] container = test1;
        int expected = task_2_4.arr2_4_2(container);
        int actual = 28;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test2423() {
        int[] container = test3;
        int expected = task_2_4.arr2_4_2(container);
        int actual = 78;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test243() {
        int[] container = test3;
        String expected = Arrays.toString(task_2_4.arr2_4_3(container));
        String actual = "[7, 39, 22, 16, 31]";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test2432() {
        int[] container = test2;
        String expected = Arrays.toString(task_2_4.arr2_4_3(container));
        String actual = "[6, 19, 24, 16]";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test2433() {
        int[] container = test1;
        String expected = Arrays.toString(task_2_4.arr2_4_3(container));
        String actual = "[7, 19]";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test244() {
        int[] container = test2;
        String expected = Arrays.toString(new int[]{task_2_4.arr2_4_4(container)});
        String actual = "[22]"; // Сумма двух минимальных значения массива
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test2442() {
        int[] container = test1;
        String expected = Arrays.toString(new int[]{task_2_4.arr2_4_4(container)});
        String actual = "[26]"; // Сумма двух минимальных значения массива
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test2443() {
        int[] container = test3;
        String expected = Arrays.toString(new int[]{task_2_4.arr2_4_4(container)});
        String actual = "[23]"; // Сумма двух минимальных значения массива
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test245() {
        int[] container = test3;
        String expected = Arrays.toString(task_2_4.arr2_4_5(container)); // ожидаемый, сжатый массив
        String actual = "[39, 22, 16, 67, 31, 54, 62, 78, 0]";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test2452() {
        int[] container = test2;
        String expected = Arrays.toString(task_2_4.arr2_4_5(container)); // ожидаемый, сжатый массив
        String actual = "[19, 24, 16, 98, 0]";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test2453() {
        int[] container = test1;
        String expected = Arrays.toString(task_2_4.arr2_4_5(container)); // ожидаемый, сжатый массив
        String actual = "[19, 28, 46, 27, 0]";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test246() {
        int[] container = test1;
        String expected = Arrays.toString(task_2_4.arr2_4_6(container)); /*
         ожидаемый результат суммы массива*/
        String actual = "[173]";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test2462() {
        int[] container = test2;
        String expected = Arrays.toString(task_2_4.arr2_4_6(container)); /*
         ожидаемый результат суммы массива*/
        String actual = "[209]";
        Assertions.assertEquals(expected, actual);
    }
        @Test
        public void test2463() {
            int[] container = test3;
            String expected = Arrays.toString(task_2_4.arr2_4_6(container)); /*
         ожидаемый результат суммы массива*/
            String actual = "[455]";
            Assertions.assertEquals(expected,actual);
    }
}
