package day35_methods_parameters;

import java.util.*;

public class MultiParams {

    public static void main(String[] args) {

        showSum(10.45, 55.10);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two doubles:");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();

        showSum(d1, d2);

    }


    public static void showSum(double x, double y) {
        double sum = x + y;
        System.out.println("The sum = " + sum);
    }
}