package day36_methods_with_return;

public class Calculator {


    public static void main(String[] args) {

        System.out.println(add(4, 9));

        double sum = add(10, 55);
        System.out.println("sum = " + sum);

        System.out.println(minus(10, 6));
        System.out.println(multiply(9, 6));
        System.out.println(divide(20, 5));
    }

    public static double add(double x, double y) {

        double sum = x + y;
        return sum;
    }

    public static double minus(double x, double y) {
        double difference = x - y;
        return difference;
    }

    public static double multiply(double x, double y) {
        double result = x * y;
        return result;
    }

    public static double divide(double x, double y) {
        double result = x / y;
        return result;
    }
}