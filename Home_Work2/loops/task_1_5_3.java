package Home_Work2.loops;
import java.util.Scanner;
public class task_1_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");
        String g = sc.nextLine();
        int odd = 0, even = 0;
        for (int i = 0; i < g.length(); i++)
            if ((g.charAt(i) - '0') % 2 == 0) even++;
            else odd++;
        System.out.println("Нечетных: " + odd  + " Четных: " + even);
    }
}
