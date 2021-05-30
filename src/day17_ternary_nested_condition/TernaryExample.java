package day17_ternary_nested_condition;

public class TernaryExample {

    public static void main(String[] args) {

        int score = 58;
        String result = (score > 60) ? "pass" : "fail";
        System.out.println("result = " + result);

        String quality = "well";
        int rating = quality.equals("good") ? 100 : 0;
        System.out.println( quality.equals("good") ? 100 : 0 );
        System.out.println("rating = " + rating);

        int score3 = 100;
        char grade = (score3 > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);

    }
}
