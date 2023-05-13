package Home_Work_2.loops;
import java.util.Scanner;
public class task_1_5_1 {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        System.out.println("Введите числа: ");
        long a = nums.nextLong();
        int max = 0;
        while (a > 0) {
            if (a % 10 > max) max = (int) (a % 10);
            a /= 10;
        }
        System.out.println("Наибольшая цифра : " + max);
    }
}
