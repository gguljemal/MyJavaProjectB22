package day44_custom_classes;

public class Animal {

    //instance variables
    String type = "dog";

    public void speak() {
        System.out.println("Dog barks woof woof");
    }

    public void eat(String food) {
        System.out.println("eating " + food);
    }

    public void eat() {
        System.out.println("Animal are eating");
    }

}
