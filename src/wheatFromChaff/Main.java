package wheatFromChaff;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        long[] values = {7, 5, 5, 5, 1};
        wheatFromChaff(values);

    }

    public static void wheatFromChaff(long[] values) {
        for (int i = 0; i < values.length; i++)  {
            if (values[i] < 0) {
                values[i] = values[i];
            } else {
                for (int j = values.length - 1; j > i; j--) {
                    if (values[j] < 0) {
                        long temp = values[i];
                        values[i] = values[j];
                        values[j] = temp;
                        break;
                    }
                }
            }
        }
         System.out.println(Arrays.toString(values));
    }
}
