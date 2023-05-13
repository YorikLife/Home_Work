package Home_Work1;
import java.util.Scanner;
public class task_4_6 {
    public static void main(String[] args) {
        System.out.println("Введите год : ");
        Scanner Scanner = new Scanner(System.in);
        int year;
        year = Scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println("Результат : ");
        } else if (year%100 == 0) {
            System.out.println("Високосный год!");
        } else {
            System.out.println("Невисокосный год!");
    }
    }
}
