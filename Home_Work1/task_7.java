package Home_Work1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
public class task_7 {
        public static void main(String[] args) {
            int n = 9;
            int[] arr = IntStream.rangeClosed(0, n).toArray();
            Scanner nums = new Scanner(System.in);
            System.out.println("Введите свои цифры в формате :" + Arrays.toString(arr));
            if (nums.hasNext()) {
                int num0 = nums.nextInt();
                int num1 = nums.nextInt();
                int num2 = nums.nextInt();
                int num3 = nums.nextInt();
                int num4 = nums.nextInt();
                int num5 = nums.nextInt();
                int num6 = nums.nextInt();
                int num7 = nums.nextInt();
                int num8 = nums.nextInt();
                int num9 = nums.nextInt();
                System.out.println("(" + num0 + num1 + num2 + ") - " + num3 + num4 + num5 + "-" + num6 + num7 + num8 + num9);
            }
        }
    }
