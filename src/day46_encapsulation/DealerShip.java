package day46_encapsulation;

public class DealerShip {

    public static void main(String[] args) {


        Car c1 = new Car();

        c1.setModel("Nissan Altima");
        System.out.println("c1.getModel() = " + c1.getModel());

        c1.setYear(2020);
        System.out.println("c1.getYear() = " + c1.getYear());

        c1.setMileage(25639);
        System.out.println("c1.getMileage() = " + c1.getMileage());

        System.out.println("c1.toString() = " + c1.toString());

        Car alpha = new Car();
        alpha.setModel("Alfa Romeo Giulia Ti AWD");
        alpha.setYear(2017);
        alpha.setMileage(16604);

        System.out.println("alpha.getModel() = " + alpha.getModel());
        System.out.println("alpha.getYear() = " + alpha.getYear());
        System.out.println("alpha.getMileage() = " + alpha.getMileage());

        System.out.println("alpha.toString() = " + alpha.toString());

    }
}