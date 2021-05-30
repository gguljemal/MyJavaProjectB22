package day17_ternary_nested_condition;

public class VendingNestedIf {

    public static void main(String[] args) {

        String selection = "drink"; // or "snack"
        String drink = "tea"; //, "coke";
        String snack = "chips";  //"candy"

        if (selection.equals("drink")) {
            System.out.println("Drink option is selected");
            if (drink.equals("tea")) {
                System.out.println("tea is selected");
            } else if (drink.equals("coke")) {
                System.out.println("coke is selected");
            }
        } else if (selection.equals("snack")) {
            System.out.println("Snack option is selected");
            if (snack.equals("chips")) {
                System.out.println("chips has been selected");
            } else if (snack.equals("candy")) {
                System.out.println("candy has been selected");
            }
        }
    }
}
