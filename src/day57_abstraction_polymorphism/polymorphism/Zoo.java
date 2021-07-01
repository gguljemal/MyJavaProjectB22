package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal cat = new Cat();

        //Polymorphism - polymorphic way:
        //parent type =  new child type
        animal.makeNoise();
        animal1.makeNoise();
        animal2.makeNoise();
        cat.makeNoise();

        List<Dog>dogList  = new ArrayList<>();
        dogList.add(new Dog());
        dogList.add(new Dog());

    }
}
