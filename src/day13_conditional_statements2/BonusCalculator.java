package day13_conditional_statements2;

import java.util.*;

public class BonusCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double bonus ;
        double salesAmount = scan.nextDouble();

        if (salesAmount == 2000) {
            System.out.println("Good job, you qualified for bonus!");
            bonus = 50.0;
        } else {
            System.out.println("great job, you are qualified for full bonus!");
            bonus = 100.0;
        }
        System.out.println("Your total bonus is " + bonus);
    }
}
