package strings;

public class Main {
    public static void main(String[] args) {
        String str = "dfdfdfdsfdfdfdfdsfs";
        char[] dst = new char[str.length()];
        str.getChars(0, str.length()-6, dst, 6);
        String str2 = new String(dst);
        System.out.println(dst);
        boolean b = str.regionMatches(0, str2, 2, 2);
        System.out.println(b);
    }
}
