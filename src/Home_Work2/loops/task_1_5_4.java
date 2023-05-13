package Home_Work_2.loops;
import java.util.Scanner;
public class task_1_5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для преобразования в ряд Фибоначчи : ");
        int a = sc.nextInt();
        int i;
        int j = 1;
        int n = 6;
        int sum;
        for (i = 0; i < n;) {
            sum = i + j;
            i = j;
            j = sum;
            System.out.print(sum + " ");
        }
    }
}
