package day13_conditional_statements2;

import java.util.*;

public class NiceDayOrNot {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int temp = scan.nextInt();

        if (temp <= 70){
            System.out.println("It is a beautiful Day!");
            System.out.println("Lets code java!");
        }else{
            System.out.println("It is kind of cold today");
            System.out.println("Lets stay home and code java");
        }

    }
}
