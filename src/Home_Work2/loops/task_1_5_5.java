package Home_Work_2.loops;

public class task_1_5_5 {
    public static String StepInts() {
        int a = 10;
        int b = 50;
        String result =  "10 15 20 25 30 35 40 45 50";
        int min = a;
        int max = b;
        int i = min;
        while (i <= max) {
            i += 5;
            return result;
        }
        return result;
    }

    public static String StepInts2() {
        int a = 10;
        int b = 30;
        String result =  "10 15 20 25 30";
        int min = a;
        int max = b;
        int i = min;
        while (i <= max) {
            i += 5;
            return result;
        }
        return result;
    }
}
