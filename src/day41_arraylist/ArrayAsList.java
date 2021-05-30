package day41_arraylist;

import java.util.*;

public class ArrayAsList {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(23, 1, 34, 4, 99);

        System.out.println("nums = " + nums);

        //  nums.add(100); we cannot remove or add or clear that make changes in the size of the arrays since arrays is
        //  immutable

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(4, 2, 6, 7, 6));
        nums2.add(33);
        nums2.add(56);
        nums2.remove(2);
        nums2.remove(new Integer(2));
        System.out.println("nums2 = " + nums2);

        /*List String drinkWithCaffeine --> coffee,tea,monster,red bull,coke,pepsi,mdew,kambucha,celsius
        monster, red bull, celsius:
         caffeineAmount = 150;
        coffee, kambucha:
        caffeineAmount = 112;
        tea , coke, pepsi, mdew:
        caffeineAmount = 35;
        */

        int caffeineAmount = 0;

        List<String> drinkWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke" +
                "pepsi", "mdew", "kambucha", "celsius"));

        System.out.println("drinkWithCaffeine = " + drinkWithCaffeine);

        for (String each : drinkWithCaffeine) {

            if (each.equals("monster") || each.equals("red bull") || each.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(each + " --> " + caffeineAmount);
            } else if (each.equals("coffee") || each.equals("kambucha")) {
                caffeineAmount = 112;
                System.out.println(each + " --> " + caffeineAmount);
            } else if (each.equals("tea") || each.equals("coke") || each.equals("pepsi") || each.equals("mdew")) {
                caffeineAmount = 35;
                System.out.println(each + " --> " + caffeineAmount);
            }
        }

        for (String drink : drinkWithCaffeine) {

            switch (drink) {
                case "monster": case "red bull": case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink + " --> " + caffeineAmount);
                case "tea": case "coke": case "pepsi": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink + " --> " + caffeineAmount);
            }
        }

        drinkWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));
        // when we have more than 1 to write
        drinkWithCaffeine.forEach(each -> {
            System.out.println("---------");
            System.out.println("each = " + each);
            System.out.println("----------");
        });
    }
}
