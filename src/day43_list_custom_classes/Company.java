package day43_list_custom_classes;

public class Company {

    public static void main(String[] args) {

        /**
         * add 3 objects of Employee class
         * assign name and job titles
         * call work method
         */
        Employee e1 = new Employee();

        e1.jobTitle = "QA";
        e1.name = "Maya";
        e1.work();

        Employee e2 = new Employee();

        e2.name = "Max";
        e2.jobTitle = "SDET";
        e2.work();

    }
}
