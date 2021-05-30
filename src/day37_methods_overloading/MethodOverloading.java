package day37_methods_overloading;

public class MethodOverloading {

    public static void main(String[] args) {

        MethodOverloading.sum(10, 5);
        sum(3.1, 9.0);
        sum(10, 5.5);
        sum((int) 4.2, 1, 2);
        sum("Hello", "world");
    }

    public static void sum(int x, int y) {
        System.out.println("sum(int x, int y)");
        System.out.println("Result = " + (x + y));
    }

    public static void sum(int y, int x, int z) {
        System.out.println("sum(int x, int y,int z)");
        System.out.println("Result = " + (x + y + z));
    }

    public static void sum(double x, double y) {
        System.out.println("sum(int x, int y)");
        System.out.println("Result = " + (x + y));
    }

    public static void sum(String x, String y) {
        System.out.println("sum(int x, int y)");
        System.out.println("Result = " + (x + y));
    }
}
