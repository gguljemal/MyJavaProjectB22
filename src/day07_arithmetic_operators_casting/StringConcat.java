package day07_arithmetic_operators_casting;

public class StringConcat {

    public static void main (String[] args ){

        System.out.println( 5 + 3 + " Java " +2+7 );

        System.out.println( "Java " + (5+9) );

        System.out.println( 5 + (3+"Java") );

        String str1 = "Hello";
        String str2 = "friends" ;
        System.out.println(str1+str2);

        //Print ---> Hello friends
        System.out.println(str1+" "+str2);

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1+num2);
        //7 8
        System.out.println(num1+" "+num2);
        //78
        System.out.println(num1+""+num2);

        char char1 = 'a'; //97
        char char2 = 'b'; //98
        System.out.println(char1 + char2); //195
        System.out.println(char1 + "" + char2);
    }
}
