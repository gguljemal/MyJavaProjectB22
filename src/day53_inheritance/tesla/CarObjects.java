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

    }
}
