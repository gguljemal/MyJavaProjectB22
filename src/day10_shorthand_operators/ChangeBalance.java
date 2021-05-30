package day10_shorthand_operators;

public class ChangeBalance {

    public static void main(String[] args) {

        double balance =1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);

        balance = balance - baklava;
        System.out.println("balance after paying baklava = " + balance);

        double kunefe = 44.45;
        System.out.println("kunefe = " + kunefe);

        balance -= kunefe;
        System.out.println("balance = " + balance);

        //second kunefe is 50% off. lets buy it

        balance -= kunefe/2;
        System.out.println("balance = " + balance);

        double icedTea = 3.0;
        System.out.println("icedTea = " + icedTea);
        //buy 4 iced teas and decrease balance
        balance = balance - icedTea*4;
        System.out.println("balance after 4 iced tea = " + balance);

        //return baklava
        balance += baklava;
        System.out.println("balance after returning = " + balance);

    }
}
