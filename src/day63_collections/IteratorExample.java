package day63_collections;

import java.util.*;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("john");
        list.add("jamie");
        list.add("jorege");
        System.out.println(list);

        Iterator<String> it = list.iterator();
        it.next();
        it.remove();
        System.out.println(list);

        Set<String> names = new HashSet<>();
        names.add("james");
        names.add("kinga");
        names.add("mj");
        names.add("john");
        names.add("Pavrin");

        Iterator<String> namesIter = names.iterator();
        while (namesIter.hasNext()) {
            String currentName = namesIter.next();

            if (currentName.length() < 3 || currentName.startsWith("j")) {
                namesIter.remove();
            }
        }
        System.out.println(names);
    }
}
