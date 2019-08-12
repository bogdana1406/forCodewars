package dataReverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        dataReverse(arr);
    }

    private static void dataReverse(int[] data) {
        List<Integer> newData = new ArrayList<>();

        for (int i = data.length - 8; i >=0 ; i-=8) {
            for (int j = 0; j < 8; j++) {
                System.out.print(data[i + j]);
                newData.add(data[i + j]);
            }
            System.out.println();
        }
        System.out.println(newData);
        Integer[] arr = new Integer[newData.size()];
        newData.toArray(arr);
        System.out.println(Arrays.toString(arr));
//        for (int n = 0; n < newData.length; n++) {
//            for (int j = data.length; j <= 0; j++)
//            newData[i] = data[j - 8];
//        }
    }
}
