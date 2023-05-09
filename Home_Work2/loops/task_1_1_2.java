package Home_Work_2.loops;
import java.util.Scanner;
public class task_1_1_2 {
        static int fact(int n) {
            if (n <= 0) return 1; {
                return n*fact(n-1);// recursive call: method calling itself;
            }
        }

    public static void main(String[] args) {
        System.out.println(" Enter the number : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int f = fact(num);
        System.out.println(f);
        return;
    }
}

