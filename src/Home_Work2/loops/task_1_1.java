package Home_Work_2.loops;

public class task_1_1 {
    public static long factorials() {
        int number = 5;
        long factorial = 1;
        System.out.println("Enter your value :");
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;{
            } if (number <= 10) {
                System.out.println("Factorial of " + number + " = " + factorial);
            } else {
                System.out.println("Your value - is wrong!");
            }
        }
        return factorial;
    }


    public static long factorialtest1() {
        int number = 5;
        long factorial1 = 2;
        System.out.println("Enter your value :");
        for (int i = 1; i <= number; i++) {
            factorial1 = factorial1 * i;{
            } if (number <= 10) {
                System.out.println("Factorial of " + number + " = " + factorial1);
                System.out.print("long Factorial is 2 ");
            } else {
                System.out.println("Your value - is wrong!");
            }
        }
        return factorial1;
    }
}
