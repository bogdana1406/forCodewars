package strings;

public class StringRplace {
    public static void main(String[] args) {
        String org = "This is a test. This is too.";
        String search = "is";
        String sub = "was";
        String result = "";
        int i;

        do {
            System.out.println(org);
            // i - первая позиция вхождения "is"
            i = org.indexOf(search);
            // если была найдена
            if (i != -1) {
                // в result записать подстраку от 0 до i
                result = org.substring(0, i);
                // к жтой подстроке добавить sub ("was")
                result = result + sub;
                //добавляем в result org обрезанную с позиции i+search.length() (i+search.length() = i + 2),
                // т.е. остаток строки начиная от "is"
                result = result + org.substring(i + search.length());
                //присваиваем это в org
                org = result;
            }
        } while (i != -1);
    }
}
