package Home_Work3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double a = 4.1;
        int b = 15;
        int c = 7;
        double d = 28;
        double e = 5;
        int f = 2;
        double result;
        double result2 = Math.pow(d/e,f);
        result = a + b * c + result2;
        System.out.println("Результат : " + result); // 140.45999999999998
    }
}
