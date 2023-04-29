package Home_Work1._task_4;

import java.util.Scanner;

public class task_4_1 {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите число для проверки :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a%2 == 0) {
            System.out.println("Введённое число - четное");
        }
        else {
            System.out.println("Введенное число - нечетное");
        }
    }
}
