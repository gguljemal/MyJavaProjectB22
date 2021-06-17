package day53_inheritance.tesla;

import day53_inheritance.tesla.ElectricCar;

public class Tesla extends ElectricCar {

    public Tesla(String model, double price, int year, int range) {
        super("Tesla", model, price, year, range);
        System.out.println("Welcome to the Tesla!");
    }

}
