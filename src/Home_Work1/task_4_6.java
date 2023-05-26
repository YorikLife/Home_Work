package Home_Work1;
import java.util.Scanner;
public class task_4_6 {
    public static void main(String[] args) {
        System.out.println("Введите год : ");
        Scanner Scanner = new Scanner(System.in);
        int year;
        year = Scanner.nextInt();
        if ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println("Невисокосный год!");
        } else {
            System.out.println("Високосный год!");
        }
    }

    public static int Year() {
        int year = 2004;
        if ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0)) {
            return year;
        }
        return year;
    }
}