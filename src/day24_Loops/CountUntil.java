package day24_Loops;

import java.util.*;

public class CountUntil {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to count until: ");
        int numberToStop = scan.nextInt();
        int start = 1;

        while (numberToStop>= start){
            System.out.print(start+" ");
            start++;
        }
    }
}
