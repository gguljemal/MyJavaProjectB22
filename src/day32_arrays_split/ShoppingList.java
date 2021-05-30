package day32_arrays_split;

import java.util.*;

public class ShoppingList {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("Find the index of 'Gloves' in item arrays");

        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase("gloves")) {

                System.out.println("Gloves found at index " + i);
                break;
            }
        }

        //==================================================================
        System.out.println("Set boolean to true if first 'iPad' is found");
        boolean iPadFound = false;

        for (String each : items) {

            if (each.equalsIgnoreCase("Ipad")) {
                iPadFound = true;
                break;
            }
        }
        System.out.println(iPadFound);

        if (iPadFound) {
            System.out.println("we bought the iPad!!");
        } else {
            System.out.println("we forget th iPad!");
        }

        System.out.println("PRINT A REPORT OF EACH SHOPPING ITEMS");

        for (int i = 0; i < 5; i++) {

            System.out.println(items[i] + " - $" + prices[i] + " -#" + itemIDs[i]);
        }

        System.out.println("Look for 'Jacket' in items and print all details ");

//        for (int i = 0; i < 5; i++) {
//
//            if (i == 1) {
//                System.out.println(items[i] + " - $" + prices[i] + " -#" + itemIDs[i]);
//             break;
//            }
//        } OR

        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase("jacket")) {
                System.out.println(items[i] + " - $" + prices[i] + " -#" + itemIDs[i]);
                break;
            }
        }

    }
}
