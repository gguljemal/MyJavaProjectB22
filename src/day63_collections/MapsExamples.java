package day63_collections;

import java.util.*;

public class MapsExamples {

    public static void main(String[] args) {

        // id, names  ---> id must be unique(no duplicate)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "James");
        map.put(2, "Anna");
        map.put(2, "Daria");
        map.put(100, "Maxim");
        map.put(101, "Maxim");
        System.out.println("map = " + map);
        System.out.println("map.get(1) = " + map.get(1));
        System.out.println(map.get(50));// will give null since we do not have that key

        map.remove(1);
        System.out.println("map = " + map);
        map.put(1, "Kinga");
        System.out.println("map = " + map);
        map.remove("Maxim");
        System.out.println("map = " + map);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Anna"));

        for (Integer integer : map.keySet()) {
            System.out.println(integer + " - " + map.get(integer));

            if (map.get(integer).equals("Daria")) {
                System.out.println("This is our key " + integer);
            }
        }

    }
}
