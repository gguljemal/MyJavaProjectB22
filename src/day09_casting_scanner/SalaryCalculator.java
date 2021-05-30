package day09_casting_scanner;

import java.util.*;

public class SalaryCalculator {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter hourly rate:");
        double hourlyRate = scan.nextDouble();
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52/12;
        double annualPay = monthlyPay * 12;

        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("weeklyPay = " + weeklyPay);
        System.out.println("monthlyPay = " + monthlyPay);
        System.out.println("annualPay = " + annualPay);

    }
}
