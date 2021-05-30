package day15_switch_ternary;

import java.util.*;

public class CitySelector {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String city = scan.next();

        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering - " + city);
        }

        String teacher = scan.next();

        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is a java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        } else {
            System.out.println("Some other class with - " + teacher);
        }

        //company - "Google" OR salary >= 100k --> accept offer

        String company = "Google";
        double salary = 85_000.0;

        if (company.equals("Google") || salary == 100_000 ){
            System.out.println("Accepting offer from " + company);
        }else {
            System.out.println("Rejected offer from " + company);
        }
    }
}
