package day26_for_loop;

import java.util.Scanner;

public class CountMatches {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char letter = 'o';
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
