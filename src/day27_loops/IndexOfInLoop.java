package day27_loops;

public class IndexOfInLoop {

    public static void main(String[] args) {

        String word = "github";
        char letter = 'b';
        int indexOf = -1;

        for (int i = 0; i < word.length(); i++) {

            //     System.out.println(i + " - " + word.charAt(i));

            if (word.charAt(i) == letter) {
                indexOf = i;
                //     System.out.println(letter + " is found at indexOf = " + indexOf);
                break;  //exit for loop
            }
        }

        if (indexOf == -1) {
            System.out.println(letter + " is not present");
        } else {
            System.out.println(letter + " is found at indexOf = " + indexOf);
        }

    }
}
