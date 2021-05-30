package day37_methods_overloading;

import java.util.Arrays;

public class OverloadMain {

    public static void main(String[] args) {
        System.out.println("Hello from real main method");

        main(10);

        System.out.println(Arrays.toString(args));
    }

    public static void main(int x) {
        System.out.println("x = " + x);
    }

    public static void main(boolean x) {
        System.out.println("x = " + x);
    }
}
