package Home_Work5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public DataContainer() {

    }

    public int add(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        T[] array = Arrays.copyOf(data, data.length + 1);
        array[array.length - 1] =item;
        data = array;
        return array.length - 1;
    }
        public T get(int index) {
        if (index < 0 && index >= data.length) {
            return null;
        }
        return data[index];
    }
    public T[] getItems() {
        return data;
    }
    public boolean delete(int index) {
        if(index < 0 && index >= data.length) {
            return false;
        }
        T[] newData = Arrays.copyOf(data, data.length-1);
        for (int i = 0, j = 0; i < data.length; i++) {
            if (i == index) {
                break;
            }
            newData[j++] = data[i];
         }
        data = newData;
        return true;
    }
    public boolean delete(T item) {
        if (item == null) {
           return false;
        }
        for (int i = 0; i < data.length; i++) {
            if(Objects.equals(data[i], item)) {
                return delete(i);
            }
        }
        return false;
    }
    public void sort(Comparator<T>comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int k = 0; k < data.length - i - 1; k++) {
                if (comparator.compare(data[k], data[k+1])>0) {
                T exc = data[k];
                data[k] = data[k+1];
                data[k+1] = exc;
                }
            }
        }
    }
    @Override
    public String toString() {
      StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                s1.append(data[i]);
                if (i < data.length - 1) {
                    s1.append(", ");
                }
            }
        }
        s1.append("]");
        return s1.toString();
    }
}
