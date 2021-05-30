package day42_arrayList_collectionClass;

import java.util.*;

public class UniqueFromList {

    public static void main(String[] args) {

//        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));

        List<Integer> nums = Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6);

        List<Integer> uniqueList = getUniqueIntegers(nums);
        System.out.println("uniqueList " + uniqueList);

    }

    public static List<Integer> getUniqueIntegers(List<Integer> nums) {

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer each : nums) {
            if (Collections.frequency(nums, each) == 1) { //which appears only ones in the nums
                System.out.println(each + " ");
                uniqueList.add(each);
            }
        }
        return uniqueList;
    }
}
