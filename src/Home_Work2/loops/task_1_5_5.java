package Home_Work2.loops;
import java.util.Scanner;
public class task_1_5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число :");
        int min = sc.nextInt();
        System.out.println("Введите второе число :");
        int max = sc.nextInt();
        int i = min;
        while (i <= max) {
            System.out.printf(" " + i);
            i += 5;
        }
    }
}
