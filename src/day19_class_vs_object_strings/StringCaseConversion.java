package day19_class_vs_object_strings;

import java.util.*;

public class StringCaseConversion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        // convert word to lowercase
        System.out.println("word.toLowerCase() = " + word.toLowerCase());
        //convert word to uppercase
        System.out.println("word.toUpperCase() = " + word.toUpperCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLower = word.toLowerCase();
        System.out.println("wordInLower = " + wordInLower);

        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = scan.next();
        System.out.println("company.toUpperCase() = " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        //reassigning company only uppercase accepting
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
