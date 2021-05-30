package day40_arraylist;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(7);
        nums.add(11);

        System.out.println("nums = " + nums);
        System.out.println("nums size = " + nums.size());

        //reading from arraylist
        System.out.println("value in index 0 = " + nums.get(0));
        System.out.println("value in index 1 = " + nums.get(1));
        System.out.println("value in index 2 = " + nums.get(2));

        nums.remove(1); // remove element at index 1
        System.out.println("nums = " + nums);

    }
}
