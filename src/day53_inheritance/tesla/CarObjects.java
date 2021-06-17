package day53_inheritance.tesla;

public class CarObjects {

    public static void main(String[] args) {

        ElectricCar tesla = new ElectricCar("Tesla", "Model Y", 48190.0, 2021, 326);
        tesla.drive(50);
        System.out.println("tesla = " + tesla);
        System.out.println("tesla.getMake() = " + tesla.getMake());
        System.out.println("tesla.getModel() = " + tesla.getModel());
        System.out.println("tesla.getPrice() = " + tesla.getPrice());
        System.out.println("tesla.getYear() = " + tesla.getYear());
        System.out.println("tesla.getRange() = " + tesla.getRange());

        if (tesla.getPrice() > 10000) {
            System.out.println(tesla.getMake() + " - " + tesla.getModel() + " is out of my budget");
        } else {
            System.out.println("purchasing " + tesla.toString());
        }

        System.out.println("ElectricCar.getCount() = " + ElectricCar.getCount());

        ElectricCar tesla2 = new ElectricCar("Tesla", "CyberTruck", 59900, 2022, 300);
        System.out.println(tesla2.toString());
        System.out.println("tesla2.getCount() = " + tesla2.getCount());
        System.out.println("ElectricCar.getCount() = " + ElectricCar.getCount());

        Tesla c1 = new Tesla("Roadster", 200000, 2022, 620);
        System.out.println(c1.toString());
        c1.drive(1000);
        c1.drive(600);
        System.out.println(c1.getCount());

        ModelX car1 = new ModelX("Tesla", "Model X", 89990.0, 2021, 360);
        System.out.println(car1.toString());
        car1.drive(10);
        System.out.println("Having lunch...");
        car1.drive(10);
        System.out.println("Range remaining = " + car1.getRange());
        System.out.println("Total electric cars count = " + ElectricCar.getCount());

    }
}
