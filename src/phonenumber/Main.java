package phonenumber;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] in = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        createPhonenumber(in);
    }
    private static void createPhonenumber(int[] numbers) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                list.add("(");

            }
            if (i == 3) {
                list.add(") ");

            }
            if (i == 6) {
                list.add("-");
            }
            list.add(Integer.toString(numbers[i]));
        }

        StringBuilder builder = new StringBuilder();
        for (String s: list) {
            builder.append(s);
        }
        System.out.println(builder.toString());
        System.out.println(list);

    }
}
