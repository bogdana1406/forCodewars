package tidyNumber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        tidNumber(123456);
    }

    private static boolean tidNumber(int number) {
        boolean isTidy = true;
        String str = Integer.toString(number);
        int[] intArr = new int[str.length()];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = str.charAt(i) - '0';
        }
        for (int i = 0; i < intArr.length - 1; i++) {
            if (intArr[i] > intArr[i + 1]) {
                isTidy = false;
            }
        }
        System.out.println(Arrays.toString(intArr));
        System.out.println(isTidy);
        return isTidy;
    }
}
