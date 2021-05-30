package day15_switch_ternary;

public class ORLogicalOperator {

    public static void main(String[] args) {

        System.out.println("true || true is --> " + (true || true));
        System.out.println("true || false is --> " + (true || false));
        System.out.println("false || true is --> " + ( false|| true));
        System.out.println("false || false is --> " + (false || false));

        int apples = 5;
        int oranges = 7;

        System.out.println( apples > 3 || oranges > 4);

        if (apples > 3 || oranges > 4){
            System.out.println("No need to buy any fruit today");
        }else {
            System.out.println("Need to get some fruit");
        }

        System.out.println( apples == 0 || oranges ==0);
        if (apples == 0 || oranges ==0){
            System.out.println("we need to purchase some fruit");
        }else {
            System.out.println("We are good with fruit ");
        }
    }
}
