package mexicanWave;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        wave("");
    }

    public static String[] wave(String str) {
        String[] newString = new String[str.length()];
        char[] charsStart = str.toCharArray();
        char[] charsEnd = new char[charsStart.length];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i == j ) {
                    if (charsStart[j] == ' ') {
                        charsEnd[j] = charsStart[j];
                    } else {
                        charsEnd[j] = Character.toUpperCase(charsStart[j]);
                    }
                } else { charsEnd[j] = charsStart[j];}
            }
            newString[i] = new String(charsEnd);
        }

        if (newString.length == 0) {
            return newString;
        } else {
            StringBuilder builder = new StringBuilder();
            for (String s: newString) {
                if (!s.equals(str))
                    builder.append(s + ",");
            }

            String allStr = builder.toString();
            System.out.println(allStr);
            String[] finalStr = allStr.split(",");
            System.out.println(Arrays.toString(finalStr));
            System.out.println(finalStr[0]);
            System.out.println(finalStr.length);
            return finalStr;

        }
//        System.out.println(newString.length);
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(i + " " + newString[i]);
//        }



    }
}
