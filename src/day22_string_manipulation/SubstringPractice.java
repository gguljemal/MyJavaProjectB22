package day22_string_manipulation;

public class SubstringPractice {

    public static void main(String[] args) {

        //             012345678910
        String word = "java is fun";
        /**
         * 1) word.substring(startIndex,endIndex)
         */

        System.out.println(word.substring(0, 4));//java
        System.out.println(word.substring(5, 7));//is
        System.out.println(word.substring(8));//fun, or --> word.substring(8,11)
        System.out.println(word.substring(5));//is fun

    }
}
