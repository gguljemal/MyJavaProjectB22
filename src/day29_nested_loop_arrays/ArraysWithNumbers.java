package day29_nested_loop_arrays;

public class ArraysWithNumbers {

    public static void main(String[] args) {

        int[] nums = new int[2];
        System.out.println(nums[0]);// 0, we did not declare it
        System.out.println(nums[1]);

        String[] names = new String[2];
        System.out.println(names[0]);// null since we did not declare it
        System.out.println(names[1]);

        //declare int array counters and assign 5 values
        int[] counters = {25, 40, (int) 55.0, 100, 103};

        //declare double array prices and assign 3 prices
        double[] prices = {23.99, 100, 44.33};

        //declare String array cities and assign 4 city names
        String[] cities = {"Baltimore", "Casablanca", "NYC", "Tashkent"};
    }
}
