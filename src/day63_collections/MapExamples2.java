package day63_collections;

import java.util.*;

public class MapExamples2 {

    public static void main(String[] args) {

        //id, Person

        Map <Integer, Person> map = new HashMap<>();
        map.put(32,new Person("MJ",32));
        map.put(null,new Person("",0));

        System.out.println(map.get(31));  // will give null
        System.out.println(map.get(null)); // Person{name='', age=0}
        System.out.println(map.get(32)); // Person{name='MJ', age=32}
        System.out.println("map = " + map);

        Map <Integer, Person> map2 = new LinkedHashMap<>();
        map2.put(32,new Person("MJ",32));
        map2.put(null,new Person("",0));
        map2.put(12,new Person("Nick",10));
        System.out.println("map2 = " + map2);

        Map <Integer, Person> map3 = new TreeMap<>();
        map3.put(32,new Person("MJ",32));
        map3.put(0,new Person("",0));
        map3.put(-12,new Person("Nick",10));
        System.out.println("map3 = " + map3);
    }
}