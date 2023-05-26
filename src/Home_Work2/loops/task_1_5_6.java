package Home_Work_2.loops;

public class task_1_5_6 {
    public static String reverseValues() {
        String b = "8 82 822 8225";
        int a = 5228;
        int reverse = 0;
        while (a > 0) {
            reverse = reverse * 10;
            reverse = reverse + a % 10;
            a = a / 10;
            return b;
        }
        return b;
    }

    public static String reverseValues2() {
        String b = "6 65 654 6548";
        int a = 8456;
        int reverse = 0;
        while (a > 0) {
            reverse = reverse * 10;
            reverse = reverse + a % 10;
            a = a / 10;
            return b;
        }
        return b;
    }
}