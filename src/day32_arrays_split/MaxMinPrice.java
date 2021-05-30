package day32_arrays_split;

import java.util.Arrays;

public class MaxMinPrice {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));

        // Find and print details of most expensive item
        double maxPrice = prices[0];
        int indexOfMax = 0;

        for (int i = 0; i < prices.length; i++) {

            if (maxPrice < prices[i]) {

                maxPrice = prices[i];
                indexOfMax = i;
            }
        }
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("indexOfMax = " + indexOfMax);
        System.out.println(items[indexOfMax] + " -$" + prices[indexOfMax] + " - #" + itemIDs[indexOfMax]);

        // Find and print details of least expensive item
    }
}
