package day43_list_custom_classes;

import java.util.*;

public class ListMethods {

    public static void main(String[] args) {

        System.out.println(getDays());

        System.out.println("value in index " + getDays().get(0));

        //when we store method in variable
        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");

        //Lambda expression with removeIf
        dayNames.removeIf(each -> each.length() == 6);
        System.out.println("dayNames after using removeIf method= " + dayNames);

        System.out.println(getRandomList(3));
        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(5);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);

        nums.removeIf(each -> each < 90);
        System.out.println("nums = " + nums);
    }


    /**
     * new method getDays, no param
     * return List<String> with "Monday,Tuesday...."
     */

    public static List<String> getDays() {

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        return days;
    }

    /**
     * getRandomList
     * param: int size
     * return List <Integer>
     * generate random numbers (0-100) the count of size, and assign to List then return
     * getRandomList(3) --> 43,96,22
     * getRandomList(2)--> 66,52
     */

    public static List<Integer> getRandomList(int x) {

        Random r = new Random();
        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= x; i++) {

            int n = r.nextInt(101); //to prevent duplicate
            if (!nums.contains(n)){
                nums.add(n);
            }
        }

//        for (int i = 1; i <= x; i++) {
//
//            nums.add(r.nextInt(101));   // generate random number and add to list
//        }
        return nums;
    }
}
