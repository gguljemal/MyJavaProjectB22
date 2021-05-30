package day33_arrays;

import java.util.*;

public class SplitReview {
    public static void main(String[] args) {

        String word = "java";
        String[] array = word.split("a");
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
        int countOfA = array.length - 1;

        if (word.endsWith("a")) {
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);
    }
}
