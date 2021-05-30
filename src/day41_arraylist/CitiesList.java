package day41_arraylist;

import java.util.*;

public class CitiesList {

    public static void main(String[] args) {

        //declare arrayList

        ArrayList<String> cities = new ArrayList<>();

        //add values/cities to arraylist -->add methods
        cities.add("Washington DC"); // index -->0
        cities.add("New York"); // index -->1
        cities.add("Vienna"); // index -->2
        cities.add("Adana"); // index -->3
        cities.add("LA");  // index -->4

        // add Ashgabat to 0 index
        cities.add(0, "Ashgabat");

        //print all values in same line
        System.out.println(cities);

        //print one by one
        System.out.println(cities.get(0));
        System.out.println(cities.get(3));
        System.out.println(cities.get(cities.size() - 1));  // last index of the ArrayList

        //print count of items in arraylist
        System.out.println(cities.size());

        for (int i = 0; i < cities.size(); i++) {

            System.out.print(cities.get(i) + " ");
        }
        System.out.println();
        for (String each : cities) {
            System.out.print(each + " ");
        }
        System.out.println();

        // delete item from arraylist

        cities.remove(3);   //  removing by index

        cities.remove("New York");  //removing by object

        System.out.println(cities);

        //  remove all values

        cities.clear();
        System.out.println(cities);


    }
}
