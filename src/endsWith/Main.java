package endsWith;

public class Main {
    public static void main(String[] args) {
        String str = "abc";
        String end = "bc";
        solution(str, end);
    }

    public static boolean solution(String str, String end) {
        boolean isEnd = false;

        if (str.endsWith(end)) {
            isEnd = true;

        }
        System.out.println(isEnd);
        return isEnd;
    }
}
