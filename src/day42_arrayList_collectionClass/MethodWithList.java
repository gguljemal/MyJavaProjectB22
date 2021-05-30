package day42_arrayList_collectionClass;

import java.util.*;

public class MethodWithList {

    public static void main(String[] args) {

        /**
         * method name: printStrList
         * param: List of Strings
         * return: void
         * print all values separated by space in same line
         */
        List<String> words = new ArrayList<>();
        words.add("java");
        words.add("html");
        words.add("selenium");
        words.add("a");
        words.add("input");
        words.add("title");

        printStrList(words);

        printStrList(Arrays.asList("java", "select", "option", "br", "python", "sql"));

        List<Integer> nums = Arrays.asList(1,9,3,63,23);

        System.out.println(sumIntegerList(nums));

    }

    public static void printStrList(List<String> strings) {

        for (String each : strings) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    /**
     * method : sumIntegerList
     * param: List of Integers
     * returns : int
     * calculates sum of integers in the list then returns
     */

    public static int sumIntegerList(List<Integer> integers) {

        int sum = 0;

        for (int each : integers) {
            sum += each;
        }

        return sum;
    }
}
