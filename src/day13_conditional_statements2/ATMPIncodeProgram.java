package day13_conditional_statements2;

public class ATMPIncodeProgram {

    public static void main(String[] args) {

        System.out.println("***** WELCOME TO TD BANK ATM *****");

        int secretCode = 2233;
        int inputCode = 2200;

        if (secretCode == inputCode ){
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check your balance, deposit");
        }else{
            System.out.println("Incorrect CODE!!!" + inputCode );
            System.out.println("Please try again!");
        }

        System.out.println("Thank you for using TD Bank ATM");
    }
}
