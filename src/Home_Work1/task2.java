package Home_Work1;

public class task2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        int result = a+b/c;// сначала по правилам арифметики идет деление, а потом сложение слева направо.
        System.out.println("пример:2.1 = " + result);
        int result1 = (a+b)/c;
        System.out.println("пример 2.2 = " + result1); // 7/8 = 0.
        int result2 = (a+b++)/c;
        System.out.println("пример 2.3 = " + result2);// 8/8 = 0.
        int result3 = (a+b++)/ --c;
        System.out.println("пример 2.4 = " + result3);// 8/7=1.
        int d = 2;
        int result4 = (a*b>>d++)/ --c;
        System.out.println("пример 2.5 = " + result4);/* слева направо идем,  побитово сдвигаем вправо
        = 0, / на 7 = 0.*/
        int e = 7;
        int f = 20;
        int g = 68;
        int h = 22;
        boolean result5 = ((a + e) > f);
        System.out.println("пример 2.6 = " + result5);// 12>20? - false.
        int result6 = (g/h*d>>b++) / --c;// 5+7=12>20? - нет, 68/22*2>>2++=1/7=0.
        System.out.println("пример 2.6 = " + result6);
        boolean result7 = ((a + e) > f);
        boolean result8 = (g>=g);
        System.out.println("пример 2.7 = " + result7);//false
        System.out.println("пример 2.7 = " + result8);//true
        int result9 = (g/h*d>>b++) / --c;
        System.out.println("пример 2.7 = " + result9);//68/22*2>>2++=1/7=0.
        int k = 6;
        int l = 3;
        int z = 12;
        int x = 119;
        boolean result10 = (6 - 2) > 3;/* true. */
        System.out.println("пример 2.8 = " + result10);
        boolean result11 = (12*12<=119);//144>119 - false.
        System.out.println("пример 2.8 = "+ result11);
        boolean result12 = true && false;
        System.out.println("пример 2.9 = "+ result12);// Если одно из значений false - то общее значение - false.
    }
}
