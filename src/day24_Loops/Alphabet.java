package day24_Loops;

public class Alphabet {

    public static void main(String[] args) {

        char letter = 'a';

        while (letter <= 'z') {

            System.out.print(letter + " ");
            letter++;
        }

        System.out.println();
        letter = 'z';
        while (letter >= 'a') {

            System.out.print(letter + " ");
            letter--;
        }
    }
}
