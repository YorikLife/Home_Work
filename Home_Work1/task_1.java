package Home_Work1;
import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First value:");
        int a = in.nextInt();
            System.out.println("Your value:" + a);
            System.out.println("Your value is true");
        System.out.print("Second value:");
        int b = in.nextInt();
            System.out.println("Your value is:" + b);
            System.out.println("Your value is true");
                int result1 = a & b; // 37 = результат перевода в побитовое значение оператора & (AND) = 5 = 00100101
                System.out.println(result1);
                int result2 = a | b; // 15 = результат перевода в побитовое значение оператора | (OR) = 47 = 00101111
                System.out.println(result2);
        in.close();

    }
}
