package Home_Work1;
import java.util.Scanner;
public class task_4_3 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner keyboard = new Scanner(System.in);
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        if ((x%y)==0) {System.out.println(x+ " Делится на " + y);
        } else {
            System.out.println(x+ " Не делится на " + y); }
    }


    public static boolean getDivisibile(int x, int y ) {
        return x % y == 0;
    }
}