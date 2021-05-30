package day24_Loops;

import java.util.*;

public class DoWhileLoop {

    public static void main(String[] args) {

        int counter = 10;

        do {
            System.out.println("counter = " + counter);
            counter += 10;

        } while (counter <= 100);
//===================================================================


        Scanner scan = new Scanner(System.in);
        int secretCode = 123415;
        int pinCode;

        do {
            System.out.println("Enter pin code:");
            pinCode = scan.nextInt();
        } while (secretCode != pinCode);

        System.out.println("You are all set!!!");

    }
}
