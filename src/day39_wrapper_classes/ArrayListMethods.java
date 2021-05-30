package day39_wrapper_classes;

import java.util.*;

public class ArrayListMethods {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());

        if (list.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, code java then go to mall");
        }

        list.add("shoes");
        list.add("cheap monitor");
        list.add("mask");
        list.add("wooden spoon");
        list.add("scooter");
        list.add("java book");
        list.add("tesla");

        int count = list.size();
        System.out.println("Items to buy = " + count);

        System.out.println("is shoes in my list " + list.contains("shoes"));
        if (list.contains("shoes")) {
            System.out.println("shoes is in the list");
        } else {
            System.out.println("shoes is not in the list");
        }

        list.remove("shoes");
        System.out.println("list = " + list);

        System.out.println("Done shopping, get back to coding");
        list.clear();

    }
}
