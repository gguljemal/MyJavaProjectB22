package day09_casting_scanner;

import java.util.*;

public class RemainderOperator {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       int cents = scan.nextInt();
       int dollars = cents/100;
       int remain = cents%100;

        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remain = " + remain);

        //in x cents: y dollars z cents

        System.out.println("In " + cents + " cents: " + dollars + " dollars " + remain + " cents");

    }
}
