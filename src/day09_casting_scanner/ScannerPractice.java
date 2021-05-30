package day09_casting_scanner;

import java.util.*;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.println("age = " + age);

        // scan.close(); ---> optional

        System.out.println("Enter 2 values");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = num1+num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("result = " + result);

    }
}