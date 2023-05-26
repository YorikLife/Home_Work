package Home_Work1;
import java.util.Scanner;
public class Task_5_1 {
    public static void main(String[] args) {
        Scanner weekend = new Scanner(System.in);
        System.out.println("Спать ли дальше?? Ответ : 1 (рабочий день) или 2 (отпуск)?");
        int vacation = 2;
        int week = 1;
        int a = weekend.nextInt();
        if (a == 1) {
            System.out.println("Пора идти на работу !!!");
        } else if
        (a == 2) {
            System.out.println("Пора спать!");
        } else {
            System.out.println("Вы ввели не верное значение!");
        }
    }

    public static boolean SleepIn(boolean week, boolean vacation) {
        return !week || vacation;
    }
}