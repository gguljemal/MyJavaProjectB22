package day33_arrays;

import java.util.*;

public class ReverseArray1 {

    public static void main(String[] args) {

        int[] nums = {5, 10, 4, 100};
        int[] numsReverse = new int[nums.length];

        for (int i = nums.length - 1, j = 0; i >= 0; j++, i--) {

            numsReverse[j] = nums[i];
        }
        System.out.println(Arrays.toString(numsReverse));
        System.out.println(Arrays.toString(nums));

    }
}
