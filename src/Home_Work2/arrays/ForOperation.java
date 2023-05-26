package Home_Work_2.arrays;

public class ForOperation implements IArraysOperation {
    @Override
    public int ar2_2_1(int[] container) {
        int i = 0;
        for (i = 0; i < container.length; i++) {
            System.out.println(container[i] + " ");
        }
        return i;
    }

    @Override
    public void ar2_2_2(int[] container) {
        int i;
        for (i = 1; i < container.length; i++) {
            if (i % 2 == 0) {
                System.out.println(container[i - 1] + " ");
            }
        }
    }

    @Override
    public void ar2_2_3(int[] container) {
        int i;
        for (i = container.length - 1; i >= 0; i--) {
            System.out.println(container[i] + " ");
        }
        System.out.println();
    }
}
