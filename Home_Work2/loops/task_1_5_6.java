package Home_Work2.loops;
import java.util.Scanner;

public class task_1_5_6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число :");
        int a = num.nextInt();
        int reverse = 0;
        while (a > 0) {
            reverse = reverse * 10;
            reverse = reverse + a % 10;
            a = a / 10;
            System.out.println(" " + reverse);
        }
    }
}