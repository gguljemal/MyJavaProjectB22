package day21_string_manipulation;

public class FirstAndLastTest {

    public static void main(String[] args) {

       String word = "MOM";
       char first = word.charAt(0);
       char second = word.charAt(2);

       if (first==second){
           System.out.println("first and last letters match");
       }else{
           System.out.println("first and last letters mismatch");
       }

       // OR we can do like this below
        if (word.charAt(0)==word.charAt(2)){
            System.out.println("first and last letters match");
        }else {
            System.out.println("first and last letters mismatch");
        }

        String word2 = "aziza";
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word2.length()-1);


    }
}
