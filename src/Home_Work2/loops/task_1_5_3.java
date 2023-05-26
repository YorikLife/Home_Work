package Home_Work_2.loops;

public class task_1_5_3 {
    public static int EvenOdds() {
        System.out.println("Введите число : ");
        String a = String.valueOf(41);
        String g = a;
        int odd = 0, even = 0;
        for (int i = 0; i < g.length(); i++)
            if ((g.charAt(i) - '0') % 2 == 0) even++;
            else odd++;
        return (even + odd);
    }

    public static int EvenOdds2() {
        System.out.println("Введите число : ");
        String a = String.valueOf(2);
        String g = a;
        int odd = 0, even = 0;
        for (int i = 0; i < g.length(); i++)
            if ((g.charAt(i) - '0') % 2 == 0) even++;
            else odd++;
        return (even + odd);
    }

    public static int EvenOdds3() {
        System.out.println("Введите число : ");
        String a = String.valueOf(11);
        String g = a;
        int odd = 0, even = 0;
        for (int i = 0; i < g.length(); i++)
            if ((g.charAt(i) - '0') % 2 == 0) even++;
            else odd++;
        return (even + odd);
    }
}
