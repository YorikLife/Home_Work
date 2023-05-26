package Home_Work_2.arrays;

public class WhileOperation implements IArraysOperation {
    @Override
    public int ar2_2_1(int[] container) {
       int i = 0;
        while (i < container.length) {
            System.out.println(container[i] + " ");
            i++;
            System.out.println(" ");
        }
        System.out.println();
        i = 0;
        return i;
    }

    @Override
    public void ar2_2_2(int[] container) {
        int i = 1;
        while (i <= container.length) {
            if (i % 2 == 0) {
                System.out.println(container[i - 1] + " ");
            }
            i++;
        }
        System.out.println();
    }

    @Override
    public void ar2_2_3(int[] container) {
        int i = container.length - 1;
        System.out.println("While :");
        while (i >= 0) {
            System.out.println(container[i] + " ");
            i--;
        }
        System.out.println();
    }
}
