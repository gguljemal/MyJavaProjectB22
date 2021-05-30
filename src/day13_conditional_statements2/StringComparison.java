package day13_conditional_statements2;

import java.util.*;

public class StringComparison {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();

        if (city.equals("Los Angeles")) {
            System.out.println("It is LA");
        }else {
            System.out.println("It is not LA");
        }

        String weather = "sunny";

        // if (weather == "sunny") --->> it works, not error, but void

        if (weather.equals("sunny")){
            System.out.println("Lets go out and code java!");
        }
        else {
            System.out.println("Lets stay indoors, and code java!");
        }
    }
}
