package day47_constructors;

public class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println("No-args constructor");
    }

    public Student(String name) {
        System.out.println("name param constructor | name = " + name);
    }

    public Student(int age) {
        System.out.println("age param constructor | age = " + age);
    }

    public Student(String name, int age) {
        System.out.println("name&age param constructor | name&age = " + name + " - " + age);
    }

}
