package day32_arrays_split;

import java.util.*;

public class SplitMethod {

    public static void main(String[] args) {

        String words = "java,python,selenium,html";
        String[] wordsArray = words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("Arrays length is " + wordsArray.length);

        for (String each : wordsArray) {
            System.out.println(each);
        }
//=======================================================================

        String sentence = "today I am coding java arrays";
        String[] sentenceArray = sentence.split(" ");
        System.out.println("sentenceArray = " + sentenceArray);
        System.out.println("sentenceArray.length = " + sentenceArray.length);
        System.out.println(sentenceArray[0]);
        System.out.println(sentence.split(" ")[0]);

        for (String each : sentenceArray) {
            System.out.println(each);
        }
    }
}
