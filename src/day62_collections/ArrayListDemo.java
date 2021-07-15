package day62_collections;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        List<String> names = new ArrayList<>(); //polymorphism
        Collection<String> school = new ArrayList<>();  //polymorphism

        names.add("McLean");
        names.add("Vienna");
        names.add("New York");
        System.out.println(names);
        System.out.println("first city: " + names.get(0));
        System.out.println("count of cities = " + names.size());


    }
}
