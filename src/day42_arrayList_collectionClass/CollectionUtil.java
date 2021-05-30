package day42_arrayList_collectionClass;

import java.util.*;

public class CollectionUtil {

    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " + letters.size());

        System.out.println("before reversing letter = " + letters);
        Collections.reverse(letters);
        System.out.println("reversed letters = " + letters);

        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("min letter = " + Collections.min(letters));
        Collections.replaceAll(letters, 'a', 'u');
        System.out.println("after replacing letters in letters " + letters);
        Collections.sort(letters);
        System.out.println("after sorting " + letters);

        List<Integer> nums = Arrays.asList(23, 4, 587, 2336, 2, 65, 6, -6);
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums = " + nums);

        int maxNum = Collections.max(nums);
        int minNum = Collections.min(nums);
        System.out.println("max number " + maxNum);
        System.out.println("min number " + minNum);

        int countFour = Collections.frequency(nums, 4);
        System.out.println("how many 4 we have " + countFour);

        int countOne = Collections.frequency(nums, 1);
        System.out.println("how many 1 we have in nums " + countOne);

        Collections.reverse(nums);
        System.out.println("nums = " + nums);

        Collections.replaceAll(nums, 2, 0);
        System.out.println("After replacing number 2 -> 0 " + nums);

        Collections.sort(nums);
        System.out.println("nums = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reversing sort nums = " + nums);

        Collections.shuffle(nums);
        System.out.println("after shuffle = " + nums);

    }
}
