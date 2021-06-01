package day48_constructors_static;

public class BusObjects {

    public static void main(String[] args) {

        Bus bus = new Bus();

        System.out.println("bus = " + bus);

        bus.driver = new Driver("Abbas");
        bus.engine = new Engine(10);
        System.out.println("bus = " + bus);

        Bus bus1 = new Bus();
        bus1.engine = new Engine(15);
        bus1.driver = new Driver("Aziz");
        System.out.println("bus1 = " + bus1);

        //print Driver name of bus1
        bus1.driver.getName();
    }
}
