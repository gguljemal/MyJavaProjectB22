package day19_class_vs_object_strings;

import java.time.Instant;
import java.util.Scanner;

public class LoginTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userName = scan.next();
        String password = scan.next();

        String expUserName = scan.next();
        String expPassword = scan.next();


        if (userName.equalsIgnoreCase(expUserName) && password.equals(expPassword)) {
            System.out.println("Pass - user logged in successfully " + Instant.now());
        } else {
            if (!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("Fail - username is incorrect");
            } else {
                System.out.println("Fail - password is incorrect");
            }

        }
    }
}
