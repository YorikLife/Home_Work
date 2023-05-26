package Home_Work_2.loops;
import java.util.Random;
public class task_1_5_2 {
    public static int Random() {
        Random digits = new Random();
        int Low = 1;
        int High = 1000;
        int digitsNumber = digits.nextInt(High - Low) + Low;
        if (digitsNumber % 2 != 0) {
            digitsNumber = digitsNumber + 1;
            return digitsNumber;
        }
        return digitsNumber;
    }

    public static int Random2() {
        Random digits = new Random();
        int Low = 1;
        int High = 1000;
        int digitsNumber = digits.nextInt(High - Low) + Low;
        if (digitsNumber % 2 != 0) {
            digitsNumber = digitsNumber + 1;
            return digitsNumber;
        }
        return digitsNumber;
    }
}

