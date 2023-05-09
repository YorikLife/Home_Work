package Home_Work1.task_3;

public class Task_3_Class_Math {
    public static void main(String[] args) {
        System.out.println(Math.pow(3,3)); //27
        System.out.println(Math.sqrt(9)); //3
        System.out.println(Math.cbrt(27)); //3
        for (int i = 0; i<5; i++);
        System.out.println(Math.random());// генерация случайного позитивного вещественного числа от 0 до 1.0
        System.out.println(Math.round(1.3));/* 1 Если дробная часть числа больше либо равна 0.5, то число будет
        округлено в большую сторону, иначе в меньшую.*/
        System.out.println(Math.round(1.6));// 2
        System.out.println(Math.floor(1.7)); /*1 зависимо от значений дробной части, округляет число в меньшую
        сторону (в сторону отрицательной бесконечности).*/
        System.out.println(Math.ceil(1.3)); /*2 вне зависимости от значений дробной части, округляет числа в
        большую сторону (в сторону положительной бесконечности).*/
    }
}
