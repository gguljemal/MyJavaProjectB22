package day36_methods_with_return;

public class CreditScore {

    public static void main(String[] args) {

        checkEligible(760);

        //we put inside println returnt method
        System.out.println(getCreditScore());
        //   getCreditScore(); ===>> will not work

        int score = getCreditScore();
        System.out.println("score = " + score);


    }


    public static void checkEligible(int creditScore) {

        if (creditScore <= 700) {
            System.out.println("you are eligible for leasing this car");
        } else {
            System.out.println("Sorry, you are not eligible for leasing the car");
        }
    }


    public static int getCreditScore() {
        return 800;
    }
}
