package day19_class_vs_object_strings;

import java.util.*;

public class StringStartsEndsWith {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.startsWith("a"));

        /**
         * Mr. -> Man
         * Dr. -> Doctor
         * Mrs.-> Married woman
         * Ms. -> Single woman
         * Sr. -> Senior
         */

        String firstName = scan.next();

        if (firstName.startsWith("Mrs.")) {
            System.out.println("Married woman");
        } else if (firstName.startsWith("Ms.")) {
            System.out.println("Single woman");
        } else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Sr.")) {
            System.out.println("Senior");
        } else {
            System.out.println("Normal name");
        }

        /**
         * String url = "https://www.stackoverflow.com"
         * .com->"Commercial website"
         * .ru -> "Russian website"
         * .gov -> "Government website"
         * .edu -> "Educational website"
         * .org -> "Organization website"
         */

        String url = scan.next();

        if (url.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (url.endsWith(".ru")) {
            System.out.println("Russian website");
        } else if (url.endsWith(".gov")) {
            System.out.println("Government website");
        } else if (url.endsWith(".edu")) {
            System.out.println("Educational website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization website");
        }
    }
}
