package Home_Work1;
import java.util.Scanner;
public class task_4_4 {
    public static void main(String[] args) {
        System.out.println("Введите число : ");
        Scanner keyboard = new Scanner(System.in);
        int x = (keyboard.nextInt() * 1024);
        System.out.println(x + " = значение числа из байтов в килобайты ");

    }
}
