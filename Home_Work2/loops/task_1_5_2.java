package Home_Work2.loops;
import java.util.Random;
public class task_1_5_2 {
    public static void main(String[] args) {
        Random digits = new Random();
        int Low = 1;
        int High = 1000;
        int digitsNumber = digits.nextInt(High - Low) + Low;

        {
            if (digitsNumber % 2 != 0)
                digitsNumber = digitsNumber + 1;
            System.out.println(digitsNumber);
        }
    }
}

