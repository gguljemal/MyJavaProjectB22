package day46_encapsulation;

public class Bank {

    public static void main(String[] args) {

        CheckingAccount acc = new CheckingAccount();

        acc.setAccountNumber(55465466456l);
        acc.setBalance(250.00);
        acc.setAccountHolder("Mike Smith");
        acc.setType("360 checking");

        System.out.println("acc.getAccountHolder() = " + acc.getAccountHolder());
        System.out.println("acc.getAccountNumber() = " + acc.getAccountNumber());
        System.out.println("acc.getBalance() = " + acc.getBalance());
        System.out.println("acc.getType() = " + acc.getType());

        System.out.println("acc.toString() = " + acc.toString());
    }
}
