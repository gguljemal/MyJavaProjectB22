package day24_Loops;

import java.util.*;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random randomNum = new Random();

        int secretNum = randomNum.nextInt(101);
        int guessingNumber = 0;

        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if (guessingNumber > secretNum) {
                System.out.println("wrong, you number is too large");
            } else if (guessingNumber < secretNum) {
                System.out.println("wrong, you number is too small");
            }
        } while (guessingNumber != secretNum);
    }
}
