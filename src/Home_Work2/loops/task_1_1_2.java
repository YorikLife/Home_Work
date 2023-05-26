package Home_Work_2.loops;

public class task_1_1_2 {
    static int fact(int n) {
        if (n <= 0) return 1;
        {
            return n * fact(n - 1);// recursive call: method calling itself;
        }
    }
    public static boolean Recursive() {
        int num = 5;
        int f = fact(num);
        System.out.println(f);
        return true;
    }

    public static boolean Recursive2() {
        int num2 = 3;
        int f = fact(num2);
        System.out.println(f);
        return true;
    }
}
