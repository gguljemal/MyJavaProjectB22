package day08_casting_scanner;

import java.util.*;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner scan = new Scanner( System.in );

        System.out.println("Please enter your name:" );
        String name = scan.nextLine();
        System.out.println( "Nice to meet you, " + name );
        double num = scan.nextDouble();

    }
}
