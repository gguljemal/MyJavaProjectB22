package day08_casting_scanner;

public class ShoppingBalanceCalculator {

    public static void main ( String[] args){

        double balance = 345.55;
        System.out.println("initial balance = " + balance);
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.0;

        double remainingBalance = balance - (price1 + price2 + price3);
        System.out.println("remainingBalance = " + remainingBalance);

          int newBalance = (int)remainingBalance;
        System.out.println("newBalance = " + newBalance);

    }
}
