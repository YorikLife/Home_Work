package Home_Work1;
import java.util.Scanner;
public class task_4_5 {
    public static void main(String[] args) {
        System.out.println("Введите свое значение :");
        Scanner keyboard = new Scanner(System.in);
        long b = keyboard.nextByte();
        byte code = (byte) b;
        System.out.println((char) code);
        if (b > 0 && b < 65 ) {  // промежуток с 0-65.
            System.out.println("Данное значение - не является буквой ");
        } else
        if (b > 64 && b < 91 ) { // промежуток с 65 до 90.
            System.out.println("Данное значение является буквой");
            }
        }
    }