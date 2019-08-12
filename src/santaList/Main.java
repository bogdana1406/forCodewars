package santaList;

import java.util.*;
import java.util.Collections;

public class Main {
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
        Set<String> list = new HashSet<>();

        List<String> list1 = new ArrayList<>();
        for (String s: santaList) {
            for (String child: children) {
                if (s.equals(child)) {
                    list.add(s);
                    list1.add(s);
                }
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            for (int j = i +1; j < list1.size() - 1; j++) {
                if (list1.get(i).equals(list1.get(j))) {
                    list1.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
        List<String> finalList = new ArrayList<>(new HashSet<>(list));
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
