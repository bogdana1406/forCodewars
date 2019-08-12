package whichAreIn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] arr1 = {"live",  "arp", "strong" };
        String[] arr2 = { "lively", "alive", "harp", "sharp", "armstrong" };
        inArray(arr1, arr2);
     }

    public static void inArray(String[] array1, String[] array2) {

        List<String> list = new ArrayList<>();
        for (String s1: array1) {
            for (String s2: array2) {
                if (s2.contains(s1)) {
                    System.out.println(s1);
                    list.add(s1);
                    break;
                }
            }
        }
        Collections.sort(list);
        String[] resultArr = new String[list.size()];
        list.toArray(resultArr);
        System.out.println(Arrays.toString(resultArr));
        System.out.println(list);

    }
}
