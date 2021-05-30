package day12_conditional_statement;

public class ComparisonExample {

    public static void main ( String[] args){

        int speedLimit = 55;
        int currentSpeed = 45;
        System.out.println( currentSpeed > speedLimit ); // false 45 NOT more 55
        System.out.println( speedLimit < currentSpeed ); //false 55 NOT less 45
        System.out.println( speedLimit == currentSpeed); //false 55 NOT equal to 45

        boolean isSpeeding = currentSpeed > speedLimit;

        System.out.println("Are you speeding? " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph") ;
        System.out.println("speedLimit = " + speedLimit + " mph");
        //40 + 20 -->65

        currentSpeed += 20; // updated 65
        isSpeeding = currentSpeed > speedLimit;

        System.out.println("Are you speeding? " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph") ;
        System.out.println("speedLimit = " + speedLimit + " mph");

        double accountBalance = 250.25;
        double itemPrice = 100;

        System.out.println( "Can I afford - " + (accountBalance >= itemPrice) ); //true

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("canAfford = " + canAfford);

        // decrease balance by itemPrice using shorthand operator
         accountBalance -= itemPrice;

         boolean isBroke = accountBalance <= 0;
        System.out.println(" Am I broke ? - " + isBroke);
    }
}
