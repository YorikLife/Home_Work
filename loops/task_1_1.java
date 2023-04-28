package Home_Work_2.loops;
import java.util.Scanner;
public class task_1_1 {
    public static void main(String[] args) {
        int number = 10;
        long factorial = 1;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter your value :");
        number = Scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
            {
            }
            if (number <= 10) {
                System.out.println("Factorial of " + number + " = " + factorial);
            } else {

            System.out.println("Your value - is wrong!");
                break;
            }
        }
    }
}