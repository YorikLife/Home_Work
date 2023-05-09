package Home_Work2.utils;

import java.util.Random;
import java.util.Scanner;
public class ArraysUtils {
    public static int[] arrayFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива :");
        int a = sc.nextInt();
        int [] arSize = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Введите элементы массива: ");
            arSize [i] = sc.nextInt();
        }
        return arSize;

    }
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] arrayRandom = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayRandom [i] = random.nextInt(maxValueExclusion);
        }
        return arrayRandom;
    }
}
