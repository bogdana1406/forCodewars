package positionAverage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String s = "444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490";
        posAverage(s);
    }

    private static void posAverage(String s) {
        String[] subStrs = s.split(", ");

        double count = 0;
        double common = 0;
        for (int i = 0; i < subStrs.length; i++) {
            for (int j = i + 1; j < subStrs.length; j++) {
//                String[][] doubleArr = new String[subStrs.length][subStrs[i].length()];
                String[] number = subStrs[i].split("");
                System.out.println(Arrays.toString(number));
                String[] number2 = subStrs[j].split("");
                System.out.println(Arrays.toString(number2));
                for (int n = 0; n < subStrs[i].length(); n++) {
                    if (number[n].equals(number2[n])) {
                        System.out.println("yes");
                        count++;
                    }
                    common++;
                }

                System.out.println();
            }
            System.out.println("===============================");
            System.out.println(count);
            System.out.println(common);
            System.out.println(Math.round((count/common)*10000d)/1000d);
        }
    }
}
