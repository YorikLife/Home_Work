package Home_Work_2.loops;

public class task_1_3 {
    public static double pows(double number1, double number2) {
        System.out.println("Введите число, возводимое в степень : ");
        double result = 1;
        double c = 3125;
        System.out.println("Введите число, в какую степень возводить.");
        double b = 5.0;
        for (int i = 0; i < b; i++) {
            result = result * c;

            return result;
        }
        return result;
    }

    public static double pows2(double number1, double number2) {
        System.out.println("Введите число, возводимое в степень : ");
        double result = 2;
        double c = 3125;
        System.out.println("Введите число, в какую степень возводить.");
        double b = 5.0;
        for (int i = 0; i < b; i++) {
            result = result * c;

            return result;
        }
        return result;
    }
}






