package Home_Work_2.utils;
/*
4.1.1
  Данный метод будет сортировать переданный ему массив при помощи алгоритма пузырьковая сортировка.
 */
public class SortsUtils {
    public static void sort(int[] arr) {
        for (int i = arr.length-1; i>0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr [j] = arr [j+1];
                    arr[j+1] = a;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
        }
    }
/*
4.1.2.
 Данный метод будет сортировать переданный ему массив при помощи алгоритма шейкерная сортировка.
 */
    public static void shake (int[] arr) {
        int arrayLegth = arr.length;
        int low = 0, up = arrayLegth - 1;
    int last, tmp;
    while (low < up) {
        last = -1;
        for (int i = low; i < up; i++) {
            if (arr[i]>arr[i+1]) {
                tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tmp;
                last = i;
            }
        }
        up = last;
        if(up == -1) break;
        last = arrayLegth;
        for (int i = up-1; i >= low; i--) {
            if (arr[i]>arr[i+1]) {
                tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tmp;
                last = i;
            }
        }
        low = last + 1;
    }
    }
}
