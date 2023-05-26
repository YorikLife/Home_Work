package Home_Work_2.loops;

import java.util.Scanner;

public class task_1_2 {
        private static int n;
        public static void valuesInt() {
            System.out.println("Введите целое число :");
            Scanner keyboard = new Scanner(System.in);
            if (!keyboard.hasNextInt()) {
                System.out.println("Вы ввели не число !");
            } else {
                int a = keyboard.nextInt();
                String f = keyboard.nextLine();
                numberOfvalue(a);
            }
        }

        public static int numberOfvalue(int n) {
            task_1_2.n = n;
            int value = 1;
            while (n != 0) {
                value = value * (n % 10);
                n = n / 10;
            }
            if (value > 10) {
                System.out.println("Результат = " + value);
                numberOfvalue(value);
            }
            if (value < 0) {
                System.out.println("Введено не целое число !");
                return value;
            }
            return value;
        }

    public static int numberOfvalue2(int n) {
        task_1_2.n = n;
        int value = 1;
        while (n != 0) {
            value = value * (n % 10);
            n = n / 10;
        }
        if (value > 10) {
            System.out.println("Результат = " + value);
            numberOfvalue2(value);
        }
        if (value < 0) {
            System.out.println("Введено не целое число !");
            return value;
        }
        return value;
    }
}
