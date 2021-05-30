package day18_conditions_practice_strings_intro;

import java.util.*;

public class AuthenticationTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int expLast4SSN = scan.nextInt();
        int expPinCode = scan.nextInt();

        int last4SSN = scan.nextInt();
        int pinCode = scan.nextInt();

        if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication Test");
        } else {
            System.out.println("Authentication unsuccessful");

            if (last4SSN != expLast4SSN) {
                System.out.println("Last 4 SSN number is incorrect");
            } else if (pinCode != expPinCode) {
                System.out.println("Pin Code is incorrect");
            }
        }


    }
}
