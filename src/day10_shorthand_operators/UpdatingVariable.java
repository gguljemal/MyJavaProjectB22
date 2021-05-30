package day10_shorthand_operators;

public class UpdatingVariable {

    public static void main (String[] args){

        int count = 3;
        System.out.println("count = " + count);

        //increase count by 2
        count = count + 2;
        System.out.println("count = " + count);

        int apple = 2;
        System.out.println("apple = " + apple);

      //  apple = apple + 10;
        apple += 10;
        System.out.println("apple = " + apple);
        apple -= 3;
        System.out.println("apple = " + apple);

        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);

        pizzaSlices = pizzaSlices/2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        //have some pizza 6 slices
        pizzaSlices += 6;
        System.out.println("pizzaSlices = " + pizzaSlices);

        int cents = 9568;
        System.out.println("cents = " + cents);

        //keep whole dollars portion and just assign remaining cents
        cents = count % 100;
        System.out.println("remaining cents = " + cents);


    }
}
