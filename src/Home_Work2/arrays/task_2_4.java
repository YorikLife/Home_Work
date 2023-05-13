package Home_Work_2.arrays;

import static Home_Work2.utils.ArraysUtils.arrayRandom;
public class task_2_4 {
    public static void main(String[] args) {
        int[] container = arrayRandom(5, 100);
        arr2_4_1(container);
        arr2_4_2(container);
        arr2_4_3(container);
        arr2_4_4(container);
        arr2_4_5(container);
        arr2_4_6(container);
    }

    public static void arr2_4_1(int[] container) {
        int a = 0;
        for (int i = 0; i < container.length; i++) {
            if ((container[i] % 2 == 0) && container[i] >= 0) {
                a += container[i];
            }
        }
        System.out.println("Сумма четных положительных элементов массива :" + a);
    }

    public static void arr2_4_2(int[] container) {
        int max = 0;
        for (int i = 0; i < container.length; i += 2) {
            if (container[i] > container[max]) {
                max = i;
            }
        }
        System.out.println("Максимальный из элементов массива с четным индексом :" + max);
    }

    public static void arr2_4_3(int[] container) {
        int sum = 0;
        int md = 0;
        for (int j : container) {
            sum += j;
        }
        md = sum / container.length;
        for (int i = 0; i < container.length; i++) {
            if (container[i] < md) {
                System.out.println(container[i] + " ");
            }
        }
        System.out.println();
    }

    public static void arr2_4_4(int[] container) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < container.length; i++) {
            if (container[i] < min) {
                min2 = min;
                min = container[i];
            } else if (container[i] < min2 && container[i] != min) {
                min2 = container[i];
            }
        }
        if (min2 != Integer.MAX_VALUE) {
            System.out.println("Второй по минимальности элемент массива: " + min2);
        } else {
            System.out.println("Второго по минимальности элемента нет ");
        }
        System.out.println("Минимальный элемент в массиве :" + min);
    }

    public static void arr2_4_5(int[] container) {
        int containerLength = container.length;
        int[] exArray = new int[containerLength];
        int rem = 0;
        int a = 5;
        int b = 9;
        for (int i = 0; i < container.length; i++) {
            if (!((a <= container[i] && (container[i] <= b)))) {
                exArray[rem] = container[i];
                rem += 1;
            }
            for (int g : exArray) {
                System.out.print(g + " ");

                System.out.println(a + " " + b);
            }
        }
    }

    public static void arr2_4_6(int[] container) {
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            int b = container[i];
            sum += b % 10;
            sum += b / 10;
            sum += container[i];
        }
        System.out.println(sum);
    }
}

