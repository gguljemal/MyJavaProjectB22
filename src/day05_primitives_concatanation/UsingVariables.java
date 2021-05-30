package day05_primitives_concatanation;

public class UsingVariables {

    public static void main (String[] args){

        int num1 = 100;
        int num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = 200;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int zipCode1 =22336;
        int  zipCode2 = zipCode1;
        System.out.println("zipCode1 = " + zipCode1);
        System.out.println("zipCode2 = " + zipCode2);

        zipCode1 = 20007;
        zipCode2 = 33169;
        System.out.println("zipCode1 = " + zipCode1);
        System.out.println("zipCode2 = " + zipCode2);


    }
}
