package Home_Work1;
public class task_4_2 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6};// 15/3 = 5
        int result = 0;
        for (int m : nums) {
            result += m;
        }
        System.out.println("Значение среднего арифметического = " + result / nums.length);
    }

    public static int GetAverage() {
        int[] nums = {4, 5, 6};
        int result = 0;
        for (int m : nums) {
            result += m;
        }
        System.out.println("Значение среднего арифметического = " + result / nums.length);
        return result;
    }
}



