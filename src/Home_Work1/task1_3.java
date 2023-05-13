package Home_Work1;

public class task1_3 {
public static void main(String[]args) {
        float f = 42.5F;
            System.out.println("Пытаемся перевести в двоичную систему число : " + f);
            System.out.println("умножаем его на 2 = " + f*2);
            float f1 = 85F;
            System.out.println(f1 +" = " + Integer.toBinaryString((int) f1)); // число 85 в двоичной системе.
            float f2 = f1/2;
            System.out.println("делим 85 на 2 = " + (f2));/* при попытке перевести результат 42.5 в двоичную
            систему - java выдает ошибку, т.к. можно переводить только целые числа. */
            double d1 = 42d;// следовательно идет другим путём.
            System.out.println("42 = " + Integer.toBinaryString((int) d1)); // число 42 в двоичной системе.
            double d2 = 0.5d;
            System.out.println("0.5 = " +  d2*2);//число 0.5 в двоичной системе.
            /*можно сделать вывод, что число 42.5 в двоичной системе будет выглядеть вот таким образом:
            101010.1*/
    }
}
