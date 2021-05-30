package day14_multi_branch_if_statement;

public class LogicalANDOperator {

    public static void main(String[] args) {

        System.out.println(true && true);   //true
        System.out.println(true && false);  //false
        System.out.println(false && true);  //false
        System.out.println(false && false); //false

        System.out.println(10 > 5 && 1 == 1); //true
        System.out.println(14 > 13 && 10 > 13);  //false
        System.out.println(11 < 9 && 12 > 10);  //false
        System.out.println(18 < 20 && 15 < 11); //false

        int apples = 10, oranges = 5;
        boolean check = apples > 5 && oranges > 3;
        System.out.println("check = " + check);

        if (apples > 6 && oranges > 2) {
            System.out.println("I have enough apples and oranges");
        } else {
            System.out.println("I need to go Walmart to buy");
        }
    }
}
