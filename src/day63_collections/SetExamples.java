package day63_collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        // Set ---->> for unique data's and no index / no order

        set.add(100);
        set.add(2);
        set.add(5);
        set.add(20);
        set.add(1);
        set.add(33);

        System.out.println(set);

        Set<String> names = new HashSet<>();
        names.add("hello");
        names.add("world");
        names.add("java");
        names.add("java");
        names.add("collection");
        names.remove("world");
        System.out.println(names);
        for (String name : names) {

        }

        //converting Set collection to the List( We can have duplicated string)
        List<String> namesList = new ArrayList<>(names);
        namesList.add("world");
        System.out.println("namesList = " + namesList);

        //LinkedHashSet  ---->> insertion order is important
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("24");
        stringSet.add("java");
        stringSet.add("$#");
        stringSet.add("53");
        stringSet.add("apple");
        stringSet.add("java");
        stringSet.add("53");
        stringSet.add("cucumber");
        System.out.println("stringSet = " + stringSet);

        //TreeSet  --->> symbols->number->UpperCase->lower case order will be seen in the result
        Set<String> stringSet1 = new TreeSet<>();
        stringSet1.add("24");
        stringSet1.add("java");
        stringSet1.add("$#");
        stringSet1.add("53");
        stringSet1.add("apple");
        stringSet1.add("java");
        stringSet1.add("53");
        stringSet1.add("Cucumber");
        System.out.println("stringSet1 = " + stringSet1);
        //((TreeSet)stringSet1).first();
    }

}
