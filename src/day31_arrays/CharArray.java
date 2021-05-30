package day31_arrays;

public class CharArray {

    public static void main(String[] args) {

        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        // print each letter using a loop

        for (char each : letters) {
            System.out.print(each + " ");
        }

        // when we have char array, we can create a String out of it. It will automatically join each letter
        // into a single String
        // CONVERT CHAR ARRAY INTO STRING
        System.out.println();
        String sentence = new String(letters);
        System.out.println("sentence = " + sentence);

        // CONVERTING STRING INTO CHAR ARRAY
        String item = "wooden spoon";
        System.out.println(item.length());

        char[] itemLetters = item.toCharArray();
        for (char each : itemLetters) {
            System.out.print(each + " ");
        }
        System.out.println(itemLetters.length);

        String[] fruit = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        // "banana-apples-kiwi-mango-papaya-strawberry"

        for (String each : fruit) {
            System.out.print(each + "-");
        }
        //   USING VARIABLE
        String fruits = "";
        for (String each : fruit) {
            fruits += each + "-";
        }
        System.out.println("\nfruits = " + fruits);
    }
}
