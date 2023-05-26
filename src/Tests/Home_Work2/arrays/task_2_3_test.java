package Tests.Home_Work2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class task_2_3_test {
    int[] test1 = {1,2,3,4,5,6,7};
    int[] test2 = {1,16,56};
    int[] test3 = {14,26,33,51,84,1,4,91};

    @Test
    public void test_221doWhile1() {
        int[] container = test1;
        int[] expected = container;
        int[] actual = Home_Work_2.utils.SortsUtils.sort(container);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_221doWhile2() {

        int[] container = test2;
        int[] expected = container;
        int[] actual = Home_Work_2.utils.SortsUtils.sort(container);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_221doWhile3() {

        int[] container = test3;
        int[] expected = container;
        int[] actual = Home_Work_2.utils.SortsUtils.sort(container);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_222ForEachOperation() {

        int[] container = test1;
        int[] expected = container;
        int[] actual = Home_Work_2.utils.SortsUtils.sort(container);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_222ForEachOperation2() {

        int[] container = test2;
        int[] expected = container;
        int[] actual = Home_Work_2.utils.SortsUtils.sort(container);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_222ForEachOperation3() {

        int[] container = test3;
        int[] expected = container;
        int[] actual = Home_Work_2.utils.SortsUtils.sort(container);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_222ForOperation() {

        int[] container = test1;
        int[] expected = container;
        int[] actual = Home_Work_2.utils.SortsUtils.sort(container);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_222ForOperation2() {

        int[] container = test2;
        int[] expected = container;
        int[] actual = Home_Work_2.utils.SortsUtils.sort(container);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_222ForOperation3() {

        int[] container = test3;
        int[] expected = container;
        int[] actual = Home_Work_2.utils.SortsUtils.sort(container);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_222WhileOperation() {

        int[] container = test1;
        int[] expected = container;
        int[] actual = Home_Work_2.utils.SortsUtils.sort(container);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_222WhileOperation2() {

        int[] container = test2;
        int[] expected = container;
        int[] actual = Home_Work_2.utils.SortsUtils.sort(container);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_222WhileOperation3() {

        int[] container = test3;
        int[] expected = container;
        int[] actual = Home_Work_2.utils.SortsUtils.sort(container);
        Assertions.assertEquals(expected, actual);
    }
}
