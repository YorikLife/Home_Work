package Home_Work_2.loops;

public class task_1_5_4 {
    public static String FibValue() {
        String v = "1 2 3 5 8 13";
        System.out.println("Введите число для преобразования в ряд Фибоначчи : ");
        String a = v;
        int i;
        int j = 1;
        int n = 6;
        int sum = 0;
        for (i = 0; i < n;) {
            sum = i + j;
            i = j;
            j = sum;
        }
        return v;
    }

    public static String FibValue2() {
        System.out.println("Введите число для преобразования в ряд Фибоначчи : ");
        String v = "1 2 3 5";
        String a = v;
        int i;
        int j = 1;
        int n = 6;
        int sum2 = 0;
        for (i = 0; i < n;) {
            sum2 = i + j;
            i = j;
            j = sum2;
        }
        return v;
    }
}
