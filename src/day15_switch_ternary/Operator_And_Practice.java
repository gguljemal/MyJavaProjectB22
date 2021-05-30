package day15_switch_ternary;

public class Operator_And_Practice {

    public static void main(String[] args) {

        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden Spoon";

        if (onSale && freeShipping) {
            System.out.println("Adding to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on - " + itemName);
        }

        //  add to cart only when it is freeShipping, onsale and itemName is " Wooden Spoon"

        if (onSale && freeShipping && itemName.equals("Wooden Spoon")) {
            System.out.println("Add to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on - " + itemName);
        }
    }
}
