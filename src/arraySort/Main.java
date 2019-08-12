package arraySort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = { 2, 5, 3, 2, 8, 1, 4 };
        SortArray(array);

    }

    public static int[] SortArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if ((array[i] % 2 == 0) || (array[j] % 2 == 0)) continue;

                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
