package day56_abstraction.Greeting.driveable;

public class DrivableTest {

    public static void main(String[] args) {

        Tesla tesla = new Tesla();
        tesla.transportPeople();
        tesla.cost(11);
        tesla.start();
        tesla.stop();
        tesla.autoPiloting();
        tesla.hi();
        tesla.bye();

        Plane plane = new Plane();
        plane.land();
        plane.bye();
        plane.hi();
        plane.cost(10);
        plane.autoPiloting();
        plane.transportPeople();
        plane.stop();
        plane.start();

        //Polymorphism : will learn next class
        SelfDrivable sd = new Plane();
        SelfDrivable sd2 = new Tesla();

        Transportation tp1 = new Plane();
        Transportation tp2 = new Tesla();
    }
}
