package day31_arrays;

import java.util.*;

public class Sort_ToStringMethods {

    public static void main(String[] args) {

        //print all nums in same line
        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};

        System.out.println(Arrays.toString(nums));

        //sorting nums value
        Arrays.sort(nums);
        //print after sort and to check if it works
        System.out.println(Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length - 1]);

        String[] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join(", ", words) + "]");

        // sort words by alphabetic ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        // sort words in reverse order
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
