package enoughIsEnough;

import javax.naming.PartialResultException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

       int[] arr = { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 };

       deleteNth(arr, 1);
    }

    public static void deleteNth(int[] elements, int maxOccurrences) {
//        int n = 1;
        Map<Integer, Integer> count = new HashMap<>();

        List<Integer> list2 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            list.add(elements[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            int n = 0;
            for (int j = 0; j <list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    n++;
                    if (n <= maxOccurrences) {
                        list2.add(list.get(i));
                    }
                }
//                count.put(elements[i], n);
            }
        }
        for (Integer i: count.keySet()) {
            System.out.println("number = "+ i + " value = " +count.get(i) );
        }


        System.out.println(list2);

    }
}
