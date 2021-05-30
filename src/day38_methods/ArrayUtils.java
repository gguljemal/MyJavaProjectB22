package day38_methods;

import java.util.*;

public class ArrayUtils {

    public static void printArray(int[] nums) {

        for (int each : nums) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public static int sum(int[] nums) {

        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;
    }

    public static boolean contains(int[] nums, int num) {

        System.out.println("Arrays returning int");
        boolean found = false;

        for (int each : nums) {

            if (each == num) {
                found = true;
                break;

            }
        }
        return found;
    }

    public static boolean equals(int[] nums1, int[] nums2) {

        int count = 0;
        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    count++;
                }
            }

        }
        if (count == nums1.length) {
            return true;
        } else {
            return false;
        }

    }
}
