package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {

    public static void main(String[] args) {

        String todayClass = "python";

        if (todayClass.equals("java"))

            System.out.println("java is fun");
            //      System.out.println("second statement");
        else
            System.out.println("it is not java, it is " + todayClass);

        //==============================================================

        int a = 2;
        if (a == 1)

            System.out.println("a is 1");
        System.out.println("1 is a");

    }
}
