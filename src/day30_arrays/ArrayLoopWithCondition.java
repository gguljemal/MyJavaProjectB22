package day30_arrays;

public class ArrayLoopWithCondition {

    public static void main(String[] args) {

        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        //print all numbers from prices array that are more than 100
        for (double each : prices) {

            if (each >= 100) {
                System.out.print(each + " ");
            }
        }

        System.out.println();
        // print prices between 10 and 70 inclusive
        for (double each : prices) {

            if (each >= 10 && 70 >= each) {
                System.out.print(each + " ");
            }
        }

        System.out.println();
        //count prices that are more than 50
        int count = 0;
        for (double each : prices) {

            if (each > 50) {
                count++;
            }
        }
        System.out.println("count = " + count);

        // print countries with name length more than 7-inclusive
        for (String each : countries) {

            if (each.length() >= 7) {
                System.out.println(each);
            }
        }

    }
}
