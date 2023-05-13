package Home_Work_2.sorts;
import Home_Work2.utils.ArraysUtils;
import Home_Work2.utils.SortsUtils;
import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int [] test1 = new int[] {1,2,3,4,5,6};
        System.out.println("Состояние массива до сортировки :" + Arrays.toString(test1));
        SortsUtils.sort(test1);
        System.out.println("Состояние массива после сортировки пузырьком :" + Arrays.toString(test1));
        test1 = new int[] {1,2,3,4,5,6};
        System.out.println("Состояние массива до сортировки :" + Arrays.toString(test1));
        SortsUtils.shake(test1);
        System.out.println("Состояние массива после шейкерной сортировки :" + Arrays.toString(test1));

        System.out.println(" ");

        int [] test2 = new int [] {1,1,1,1};
        System.out.println("Состояние массива до сортировки :" + Arrays.toString(test2));
        SortsUtils.sort(test2);
        System.out.println("Состояние массива после сортировки пузырьком :" + Arrays.toString(test2));
        test2 = new int [] {1,1,1,1};
        System.out.println("Состояние массива до сортировки :" + Arrays.toString(test2));
        SortsUtils.shake(test2);
        System.out.println("Состояние массива после шейкерной сортировки :" + Arrays.toString(test2));

        System.out.println(" ");

        int [] test3 = new int [] {9,1,5,99,9,9};
        System.out.println("Состояние массива до сортировки :" + Arrays.toString(test3));
        SortsUtils.sort(test3);
        System.out.println("Состояние массива после сортировки пузырьком :" + Arrays.toString(test3));
        test3 = new int [] {9,1,5,99,9,9};
        System.out.println("Состояние массива до сортировки :" + Arrays.toString(test3));
        SortsUtils.shake(test3);
        System.out.println("Состояние массива после шейкерной сортировки :" + Arrays.toString(test3));

        System.out.println(" ");

        int [] test4 = new int[] {};
        System.out.println("Состояние массива до сортировки :" + Arrays.toString(test4));
        SortsUtils.sort(test4);
        System.out.println("Состояние массива после сортировки пузырьком :" + Arrays.toString(test4));
        test4 = new int[] {};
        System.out.println("Состояние массива до сортировки :" + Arrays.toString(test4));
        SortsUtils.shake(test4);
        System.out.println("Состояние массива после шейкерной сортировки :" + Arrays.toString(test4));

        System.out.println(" ");

        int [] test5 = new int[] {6,5,4,3,2,1};
        System.out.println("Состояние массива до сортировки :" + Arrays.toString(test5));
        SortsUtils.sort(test5);
        System.out.println("Состояние массива после сортировки пузырьком :" + Arrays.toString(test5));
        test5 = new int[] {6,5,4,3,2,1};
        System.out.println("Состояние массива до сортировки :" + Arrays.toString(test5));
        SortsUtils.shake(test5);
        System.out.println("Состояние массива после шейкерной сортировки :" + Arrays.toString(test5));

        System.out.println(" ");

        int [] test6 = ArraysUtils.arrayRandom(50, 100);
        System.out.println("Состояние массива до сортировки :" + Arrays.toString(test6));
        SortsUtils.sort(test6);
        System.out.println("Состояние массива после сортировки пузырьком :" + Arrays.toString(test6));
        test6 = ArraysUtils.arrayRandom(50, 100);
        System.out.println("Состояние массива до сортировки :" + Arrays.toString(test6));
        SortsUtils.shake(test6);
        System.out.println("Состояние массива после шейкерной сортировки :" + Arrays.toString(test6));

        System.out.println(" ");

        int [] test7 = ArraysUtils.arrayFromConsole();
        System.out.println("Состояние массива до сортировки :" + Arrays.toString(test7));
        SortsUtils.sort(test7);
        System.out.println("Состояние массива после сортировки пузырьком :" + Arrays.toString(test7));
        test7 = ArraysUtils.arrayFromConsole();
        System.out.println("Состояние массива до сортировки :" + Arrays.toString(test7));
        SortsUtils.shake(test7);
        System.out.println("Состояние массива после шейкерной сортировки :" + Arrays.toString(test7));
    }
}
