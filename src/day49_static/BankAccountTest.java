package day49_static;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.user = "husband";
        account.showBalance();
        account.spend(100);
        account.showBalance();

        BankAccount account1 = new BankAccount();

        account1.user = "wife";
        account1.showBalance();
        account1.spend(400);
        account1.showBalance();;

        account.showBalance();
     //   System.out.println("BankAccount.balance = " + BankAccount.balance);
    }
}
