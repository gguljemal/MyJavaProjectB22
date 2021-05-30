package day25_for_loop;

import java.util.*;

public class StartEnd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end");
        int start = scan.nextInt(); //5
        int end = scan.nextInt(); //10

        if (start>end){
            System.out.println("reverse numbering is not supported");
        }

        for (int i = start; i <= end; i++) {
            System.out.println(i + " ");
        }
    }
}
