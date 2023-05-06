package Home_Work2.loops;
import java.util.Locale;
import java.util.Scanner;
public class task_1_3 {
    public static void main(String[] args) {
        System.out.println("Введите число, возводимое в степень : ");
        Scanner numbs = new Scanner(System.in).useLocale(Locale.US);
        double result = 1;
        double c = numbs.nextDouble();
        System.out.println("Введите число, в какую степень возводить.");
        int b = numbs.nextInt();
        for (int i = 0; i < b; i++) {
            result = result * c;
            System.out.println(result);
        }
    }
}






