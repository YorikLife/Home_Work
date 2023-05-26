package Home_Work_2.loops;

public class task_1_5_1 {
    public static int maxValues() {
        System.out.println("Введите числа вида (123): ");
        long a = 789;
        int max = 0;
        while (a > 0) {
            if (a % 10 > max) max = (int) (a % 10);
            a /= 10;
        }
        return max;
    }

    public static int maxValues2() {
        System.out.println("Введите числа вида (123): ");
        long a = 888;
        int max = 0;
        while (a > 0) {
            if (a % 10 > max) max = (int) (a % 10);
            a /= 10;
        }
        return max;
    }
}
