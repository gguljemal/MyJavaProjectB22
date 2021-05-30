package day43_list_custom_classes;

import java.util.*;

public class MethodsWithListReturn {


    // 1 second = 1_000_000_000 nanoseconds

    /**
     * getIntegerList
     * return List<Integer>
     * loop from 0 - 1000_00
     * and add to arrayList then return it
     */

    public static void main(String[] args) {

        System.out.println(getIntegerList());

        long start = System.nanoTime();
        // we can store it
        List<Integer> mlnNum = getIntegerList();

        long end = System.nanoTime();
        System.out.println("ArrayList time end-start = " + (end - start));

        System.out.println("mlnNum = " + mlnNum);

        long startArr = System.nanoTime();
        int[] arr = getIntegerArray();
        long endArr = System.nanoTime();
        System.out.println(" Array time endArr-endArr = " + (endArr - startArr));
        System.out.println(Arrays.toString(arr));
    }

    public static List<Integer> getIntegerList() {

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            nums.add(i);
        }
        return nums;
    }

    /**
     * getIntegerArray
     * return int []
     * loop from 0 - 100
     * and add to int [] then return it
     */

    public static int[] getIntegerArray() {

        int[] nums = new int[100];

        for (int i = 0; i < 100; i++) {
            nums[i] = i;
        }
        return nums;
    }

}
