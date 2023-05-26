package Home_Work_2.arrays;

public class DoWhileOperation implements IArraysOperation {

    @Override
    public int ar2_2_1(int[] container) {
        int i = 0;
        do {
            i++;
        }
        while (i < container.length);
        i = 0;
        System.out.println();
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
        System.out.println("do: ");
        do {
            System.out.println(container[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println();
        i = container.length - 1;
    }
}
