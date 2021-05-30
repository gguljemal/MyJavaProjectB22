package day33_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitEmptySpring {

    public static void main(String[] args) {

        String word = "java";

        String[] wordArr = word.split("");
        System.out.println(Arrays.toString(wordArr));

        String word1 = "java1sql2ht9ml";
        String[] word1Arr = word1.split("\\d"); // will split with any number in sentence
        System.out.println(Arrays.toString(word1Arr)); // [java, sql, ht, ml]

        word1 = word1.replaceAll("\\d","_");
        System.out.println("word1 = " + word1);

        String password = "bcTddfsaf_a12sdf";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

    }
}
