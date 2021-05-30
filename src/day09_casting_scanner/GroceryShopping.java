package day09_casting_scanner;

import java.util.*;

public class GroceryShopping {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter price for milk:");
        double price1 = scan.nextDouble();

        System.out.println("Enter price for bread:");
        double price2 = scan.nextDouble();

        System.out.println("Enter price for cucumber:");
        int price3 = scan.nextInt();
        double totalPrice = price1+price2+price3;
        System.out.println("totalPrice = " + totalPrice);


    }
}
