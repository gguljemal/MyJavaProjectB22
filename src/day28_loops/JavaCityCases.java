package day28_loops;

public class JavaCityCases {

    public static void main(String[] args) {

        int totalCase = 0;

        for (int i = 1; i <= 30; i++) {

            if (i % 7 == 0) {  // sundays more cases
                totalCase += 500;
            } else {
                totalCase += 200;
            }

            System.out.println("Day " + i + " | total cases : " + totalCase);


        }
        System.out.println("totalCase = " + totalCase);

    }
}
