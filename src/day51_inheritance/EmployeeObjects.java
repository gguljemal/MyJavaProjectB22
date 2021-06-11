package day51_inheritance;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee developer = new Employee();
        developer.jobTitle = "Java Developer";
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(60.0);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));

        Constructor sdetConstructor = new Constructor();
        double sdetSalary = sdetConstructor.calculateSalary(55.0);
        System.out.println("sdetSalary = " + sdetSalary);
        sdetConstructor.jobTitle = "SDET";

        System.out.println(developer.toString());
        System.out.println(sdetConstructor);

    }
}
