package day14_multi_branch_if_statement;

import java.util.*;

public class CalculatorV1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 2 numbers:");
        double num1, num2;
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();

        System.out.println("enter operator: -, +, *, /");
        char operator = scan.next().charAt(0);

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else {
            System.out.println("invalid operator- " + operator);
        }

    }
}
