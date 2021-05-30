package day25_for_loop;

public class PrintEvenOddNumbers {

    public static void main(String[] args) {
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println("even number - " + i);
                countEven++;
            }
        }

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 1) {
                System.out.println("odd number - " + i);
                countOdd++;
            }
        }

        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);
    }
}
