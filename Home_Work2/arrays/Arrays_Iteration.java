package Home_Work2.arrays;

import static Home_Work2.utils.ArraysUtils.arrayFromConsole;

public class Arrays_Iteration {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        ar2_2_1(container);
        ar2_2_2(container);
        ar2_2_3(container);
    }
        public static void ar2_2_1 ( int[] container){
            System.out.println("do: ");
            int i = 0;
            do {
                i++;
            }
            while (i < container.length);
            i = 0;
            System.out.println("While: ");
            while (i < container.length) {
                System.out.println(container[i] + " ");
                i++;
                System.out.println(" ");
            }
            System.out.println();
            i = 0;
            System.out.println("for: ");
            for (i = 0; i < container.length; i ++) {
                System.out.println( container[i] + " ");
            }
            System.out.println();
            System.out.println("for each: ");
            for (int d : container) {
                System.out.println(d + " ");
            }
            System.out.println();
        }
        public static void ar2_2_2 ( int[] container) {
            System.out.println("for: ");
            int i;
            for (i = 1; i < container.length; i++) {
                if (i % 2 == 0) {
                    System.out.println(container[i - 1] + " ");
                }
            }
            System.out.println();

            System.out.println("for each: ");
            i = 1;
            for (int c : container) {
                if (i % 2 == 0) {
                    System.out.println(container[i - 1] + " ");
                }
            }
            System.out.println();

            System.out.println("do: ");
            i = 1;
            do {
                if (i % 2 == 0) {
                    System.out.println(container[i - 1] + " ");
                }
                i++;
            } while (i <= container.length);
            System.out.println();

            i = 1;
            System.out.println("While: ");
            while (i <= container.length) {
                if (i % 2 == 0) {
                    System.out.println(container[i - 1] + " ");
                }
                i++;
            }
            System.out.println();
        }
            public static void ar2_2_3(int[] container){
                System.out.println(" ");
                int i = container.length - 1;
                System.out.println("do: ");
                do {
                    System.out.println(container[i] + " ");
                    i--;
                } while (i >= 0);
                System.out.println();
                i = container.length - 1;
                System.out.println("While :");
                while (i >= 0) {
                    System.out.println(container[i] + " ");
                    i--;
                }
                System.out.println();

                System.out.println("for each: ");
                for (int g : container) {
                    System.out.println(container[i] + " ");
                    i--;
                }
                System.out.println();

                System.out.println("for: ");
                for (i = container.length - 1; i >= 0; i--) {
                    System.out.println(container[i] + " ");
                }
                System.out.println();
            }
        }
