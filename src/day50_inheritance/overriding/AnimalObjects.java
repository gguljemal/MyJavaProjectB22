package day50_inheritance.overriding;

public class AnimalObjects {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name = "Grey";
        animal.type = "Pitbull";
        animal.speak();

        Cat cat = new Cat();
        cat.name = "White";
        cat.speak();
        cat.type = "";
    }
}
