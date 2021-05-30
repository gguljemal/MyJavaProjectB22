package day12_conditional_statement;

public class CompareChars {

    public static void main(String[] args) {

         char letter1 = 'A';  //65
         char letter2 = 'B';  //74

        System.out.println( letter1 == letter2); // 65 = 74
        System.out.println( letter1 > letter2 ); // 65 > 74
        System.out.println( letter1 < letter2 ); // 65 < 74

        char grade = 'A';
        boolean pass = grade <= 'D'; //true
        System.out.println(" Did you pass the exam ? = " + pass);

    }
}
