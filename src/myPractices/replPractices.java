package myPractices;

import java.util.*;

public class replPractices {

    public static int[] mergR(int[] a, int[] b) {

        int[] nums = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            for (int each : a) {
                nums[i] = each;
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int each : b) {
                nums[i] = each;
            }
        }


        return nums;

    }//end mergR

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];
        int[] nums2 = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(mergR(nums, nums2)));
    }

}
