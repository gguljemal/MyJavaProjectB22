package day25_for_loop;

public class FizzBuzz {

    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++) {

            if (i % 15 == 0) {
                System.out.println(i + " is a FizBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " is a Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " is a Buzz");
            } else {
                System.out.println(i);
            }
        }


    }
}
