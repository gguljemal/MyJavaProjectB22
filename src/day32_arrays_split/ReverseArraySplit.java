package day32_arrays_split;

public class ReverseArraySplit {

    public static void main(String[] args) {

        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        String reverse = "";

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
            reverse += words[i] + " ";
        }

        System.out.println("sentence = " + sentence);
        System.out.println("reverse = " + reverse.trim());
//============================================================

        String word = "java";
        String[] charArr = word.split("");
        System.out.println(charArr.length);

    }
}
