package Home_Work1;
import java.util.Objects;
import java.util.Scanner;

public class task_6_1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя : ");
        String h = Scanner.nextLine();
        if (Objects.equals(h,"Вася") || (Objects.equals(h,"Анастасия"))) {
            System.out.println("Привет, я тебя так долго ждал!!!");
        }else {
            System.out.println("Здраствуйте, а вы кто ??? ");
        }
    }
}

