package Home_Work_2.loops;

public class task_1_1_1 {
    public static void main(String[] args) {
        long fact = 15;
        long result = 1;
        for (int i = 1; i <= fact; i++) {
            result *= i;
            System.out.println(i + "= " + result);
        }
    }
}
