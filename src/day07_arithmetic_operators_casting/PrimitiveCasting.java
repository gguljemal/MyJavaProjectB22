package day07_arithmetic_operators_casting;

public class PrimitiveCasting {

    public static void main(String[] args) {

        int num1 = 100;
        byte b1 = (byte) num1;
        short s1 = (short) num1;

        System.out.println("s1 = " + s1);
        System.out.println("b1 = " + b1);
        System.out.println("num1 = " + num1);
    }
}
