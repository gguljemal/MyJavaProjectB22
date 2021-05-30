package day21_string_manipulation;

import java.util.Scanner;

public class StringReplacePractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        System.out.println(word.toUpperCase());

        System.out.println(word.replace("a", "i"));

        word = word.replace("a", "o");
        System.out.println("word = " + word);

        //i->o  a-i

        System.out.println(word.replace('i', 'o').replace('a', 'i'));

        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ", "");
        System.out.println("withNoSpace = " + withNoSpace);

        //"java" --> "selenium", "fun" --> "a lot of fun" --> assign back to withNoSpace

        withNoSpace = withNoSpace.replace("java", "selenium")
                                 .replace("fun", "a lot of fun");
        System.out.println("withNoSpace = " + withNoSpace);

        String result = "1-48 of over 4,000 results for java book";
        String result2 = result.replace("1-48 of over ","")
                               .replace(",","")
                                .replace(" results for java book","");
        System.out.println("result2 = " + result2);

        int count = Integer.parseInt(result2);
        count++;
        System.out.println("count = " + count);

    }
}
