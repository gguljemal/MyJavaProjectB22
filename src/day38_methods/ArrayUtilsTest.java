package day38_methods;

public class ArrayUtilsTest {

    public static void main(String[] args) {

        int[] nums = {1, 6, 9, 7, 2, 3};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{2, 6, 3, 6, 11, 2, 20});

        System.out.println("sum of the Array nums " + ArrayUtils.sum(new int[]{1, 9, 5}));
        System.out.println("sum of the Array nums " + ArrayUtils.sum(nums));

        ArrayUtils.contains(new int[]{1, 7, 6, 1}, 1);
        System.out.println("is there num inside array nums = " + ArrayUtils.contains(new int[]{1, 7, 6, 1}, 1));

        System.out.println("Two int Arrays equal = " + ArrayUtils.equals(new int[]{1, 2, 3}, new int[]{3, 2, 5}));
    }

}
