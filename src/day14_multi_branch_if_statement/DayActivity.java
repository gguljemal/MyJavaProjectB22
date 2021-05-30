package day14_multi_branch_if_statement;

import java.util.*;

public class DayActivity {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String weather = scan.next();

        if (weather.equals("sunny")) {
            System.out.println(weather + " - Go to park, hiking, and code java");
        } else if (weather.equals("rainy")) {
            System.out.println(weather + " - Stay home, drink tea, and code java");
        } else if (weather.equals("snowy")) {
            System.out.println(weather + " - clean the car then build snowman, drink hot chocolate");
        } else if (weather.equals("windy")) {
            System.out.println(weather + " - Get ready for power loss, fly a kite, and code java");
        } else {
            System.out.println(weather + " - just keep coding java");
        }

    }
}
