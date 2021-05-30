package day26_for_loop;

import java.util.Scanner;

public class StringLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        System.out.println(word.length());

        for (int i = 0; i <= word.length() - 1; i++) { // OR for (int i = 0; i < word.length(); i++)
            System.out.println(word.charAt(i));
        }

        for (int i = word.length()-1; i >= 0 ; i--) {
            System.out.println(word.charAt(i));
        }
    }
}
