package day11_comparison_operators;

import javax.lang.model.SourceVersion;

public class Pre_IncrementDecrement {

    public static void main(String[] args) {

        // PRE-INCREMENT

        int num1 = 10;
        // ++num1
        // int num2 = num1;

        int num2 = ++num1;

        System.out.println("num1 = " + num1); // 11
        System.out.println("num2 = " + num2); // 11

        //POST-INCREMENT
        int num3 = 10;
        int num4 = num3++;

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int cars = 5;
        System.out.println( ++cars );

        int sedan = 10;
        System.out.println( sedan++ );
        System.out.println("sedan = " + sedan);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;

        System.out.println("a = " + a); // 51
        System.out.println("b = " + b); // 23
        System.out.println("c = " + c); // 73


    }
}
