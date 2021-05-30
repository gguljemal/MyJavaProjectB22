package day18_conditions_practice_strings_intro;

public class CarLeasingTest {

    public static void main(String[] args) {


        String name = "Mercedes";
        String model = "E";
        double leasePrice = 0.0;

        if (name.equals("Mercedes") && model.equals("E")) {
            leasePrice = 500.0;
        } else if (name.equals("Mercedes") && model.equals("A"))
            leasePrice = 400.0;

        System.out.println("name = " + name);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);
    }
}
