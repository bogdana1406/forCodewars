package santaList;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        List<String> santaList = new ArrayList<>();
        List<String> children = new ArrayList<>();

        for (String s: new String[] {"Jason", "Jackson", "Jordan", "Johnny"}) {
            santaList.add(s);
        }

        for (String s: new String[] {"Jason", "Jordan", "Jennifer"}) {
            children.add(s);
        }

        findHhildren(santaList, children);

    }
    public static void findHhildren(List<String> santaList, List<String> children) {

        List<String> list = new ArrayList<>();
        for (String s: santaList) {
            for (String child: children) {
                if (s.equals(child)) {
                    list.add(s);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i +1; j < list.size() - 1; j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
