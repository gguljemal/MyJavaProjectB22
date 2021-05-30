package day09_casting_scanner;

import java.util.*;

public class TemperaturePractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" F to C converting");
        System.out.println("Enter Fahrenheit value:");
        double numF = scan.nextDouble();
        double numC = (numF - 32) * 5/9;
        System.out.println("numC = " + numC);



    }
}
