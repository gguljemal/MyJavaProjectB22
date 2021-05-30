package day24_Loops;

public class WhileLoop {

    public static void main(String[] args) throws InterruptedException {

        int apples = 1;  //until 10

        while (apples <= 10) {
            System.out.println("eating an apple " + apples);
            apples++;
        }
        System.out.println("No more! ");


        System.out.println("Starting the video");
        int seconds = 0;
        while (seconds <= 117) {
            System.out.println("watching video --> second: " + seconds);
            seconds++;
            //    Thread.sleep(1000);
        }
        System.out.println("Finished watching!");


    }
}
