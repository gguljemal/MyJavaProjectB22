package day32_arrays_split;

public class SentencesSplit {

    public static void main(String[] args) {

        String sentence = " java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1 st word = " + sentence.split(" ")[0]);
        System.out.println("2 st word = " + sentence.split(" ")[1]);

        for (String each : words) {
            System.out.println(each);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] splitGoogle = googleResult.split(" ");
        System.out.println("Count = " + googleResult.split(" ")[1]);
        System.out.println("second = " + splitGoogle[3].replace("(", ""));
        System.out.println("Second number = " + splitGoogle[3].substring(1));
        System.out.println("splitGoogle.length = " + splitGoogle.length);


    }
}
