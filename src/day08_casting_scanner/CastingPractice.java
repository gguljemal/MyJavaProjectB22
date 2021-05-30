package day08_casting_scanner;

public class CastingPractice {

    public static void main (String[] args){

        //byte->short->int->long->float->double
        //*******implicit casting*********
        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;
        float  num6 = 124.4f;
        double num7 = num6;

        int num8 = 3456;
        double num9 = num8;

        System.out.println("num8 = " + num8);
        System.out.println("num9 = " + num9);

        //   *************Explicit Casting**************
        //putting large numbers to the smaller one so we have to cast it

       int num10 = 22;
       byte num11 = ( byte) num10;
       short num12 = (short) num10;
        System.out.println("num12 = " + num12);
        System.out.println("num11 = " + num11);
        System.out.println("num10 = " + num10);

        double num13 = 55.3;
        float num14 = (float) num13;
        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);

        double num15 = 12369.3;
        int num16 = (int) num15;
        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16);

    }
}
