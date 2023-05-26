package Home_Work_2.loops;

public class task_1_1_1 {
    public static long fact11() {
        long fact = 15;
        long result = 1;
        for (int i = 1; i <= fact; i++) {
            result *= i;
            System.out.println(i + " = " + result);
        }
        return result;
    }


    public static long fact111() {
        long fact1 = 12;
        long result1 = 1;
        for (int i = 1; i <= fact1; i++) {
            result1 *= i;
            System.out.println(i + " = " + result1);
        }
        return result1;
    }

    public static long fact1111() {
        long fact2 = 15;
        long result2 = 5;
        for (int i = 1; i <= fact2; i++) {
            result2 *= i;
            System.out.println(i + " = " + result2);
        }
        return result2;
    }
}