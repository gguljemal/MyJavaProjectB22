package day19_class_vs_object_strings;

import java.util.*;

public class StringLength {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count: " + word.length());

        System.out.println("wooden spoon ".length());//--->>13

        int count = word.length();
        System.out.println("count = " + count);

        String password = scan.next();

        /**
         * When password is as least 6 characters:
         * print: valid amazon password
         * ELSE
         * print password too short
         */

        if (password.length() >= 6) {
            System.out.println("valid amazon password");
        } else {
            System.out.println("Password must be at least 6 characters");
        }

        String countryCode = scan.next();
        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("Pass - case is correct");
        } else {
            System.out.println("Fail - case is incorrect");
        }
    }
}
