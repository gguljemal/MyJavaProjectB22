package day45_oop;

public class CoffeeObject {

    public static void main(String[] args) {

        Coffee myCoffee = new Coffee();

        System.out.println("coffee amount" + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink some amount = " + myCoffee.getAmount());

        myCoffee.setType("Turkish coffee");
        System.out.println("my coffee = " + myCoffee.getType());
        System.out.println(myCoffee.toString());

        Coffee coffee = new Coffee();
        coffee.setType("Cappuccino");
        System.out.println("coffee.getType(): " + coffee.getType());
        Coffee coffee2 = coffee;
        System.out.println("coffee2.getType() = " + coffee2.getType());
        coffee2.setType("Espresso");
        System.out.println("coffee2.getType() = " + coffee2.getType());
        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");
        coffee3 = coffee2;
        System.out.println("coffee3 coffe type = " + coffee3.getType());
    }
}
