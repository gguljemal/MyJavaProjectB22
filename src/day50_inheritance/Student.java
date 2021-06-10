package day50_inheritance;

public class Student extends Person {

    String school;

    public void study() {
        System.out.println(name + " is studying " + " at " + school);
    }

}
