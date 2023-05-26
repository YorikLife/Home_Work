package Home_Work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    @Override
    public int ar2_2_1(int[] container) {
        for (int d : container) {
            System.out.println(d + " ");
        }
        System.out.println();
        return 0;
    }

    @Override
    public void ar2_2_2(int[] container) {
        int i = 1;
        for (int c : container) {
            if (i % 2 == 0) {
                System.out.println(container[i - 1] + " ");
            }
        }
    }

    @Override
    public void ar2_2_3(int[] container) {
        int i = - 1;
        for (int g : container) {
            System.out.println(container[i] + " ");
            i--;
        }
        System.out.println();
    }
}
