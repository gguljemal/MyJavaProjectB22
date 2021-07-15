package day62_collections;

import java.util.*;

public class LinkListDemo {

    public static void main(String[] args) {

        List<Integer> scores = new LinkedList<>(); //polymorphism
        scores.add(5);
        scores.add(42);
        scores.add(33);
        scores.add(21);
        System.out.println("scores = " + scores);
        System.out.println("first = " + scores.get(0));
        System.out.println("second = " + scores.get(1));


        LinkedList<String> friends = new LinkedList<>();
        friends.add("Mahliya");
        friends.add("Abbas");
        friends.add("Nevzat");
        friends.addFirst("John");
        System.out.println("friends = " + friends);
        System.out.println(friends.getLast());


    }
}
