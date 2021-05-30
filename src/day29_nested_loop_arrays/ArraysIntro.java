package day29_nested_loop_arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int num = 7; //single variable
        int[] nums = new int[3]; //array variable
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;

        //or we can declare this way

        int[] nums2 = {12, 56, 96, 32, 65, 87, 4};
        System.out.println("the size of the array nums2 is " + nums2.length);

        //print values of array
        System.out.println("value at index 0 is = " + nums[0]);

        // we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]);//5
        i++;
        System.out.println(nums[i]);//10

        //hot to find out the size of the array.
        System.out.println("siz eof array nums is " + nums.length);

        //change value of array
        nums[0] = 100;
        nums[1] = 200;
        nums[2] = nums[1];

    }
}
