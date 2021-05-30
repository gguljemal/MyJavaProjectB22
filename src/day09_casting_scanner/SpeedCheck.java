package day09_casting_scanner;

import java.util.*;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the speed limit:");
        int speedLimit = scan.nextInt();
        System.out.println("Enter the current speed");
        int currentSpeed = scan.nextInt();
        System.out.println("Your over limit is:");
        int overTheLimit = currentSpeed - speedLimit;

        System.out.println("speedLimit = " + speedLimit);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("overTheLimit = " + overTheLimit);

    }
}
