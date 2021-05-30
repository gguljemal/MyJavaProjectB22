package day43_list_custom_classes;

public class Person {

    String firstName;
    int age;
    char gender;

    public void speak(){
        System.out.println("Person is speaking");
    }

}

class People {

    public static void main(String[] args) {

        Person p = new Person();
        p.age = 33;
        p.firstName = "Bob";
        p.gender = 'M';
        p.speak();

        System.out.println("name = " + p.firstName);
        System.out.println("p.age = " + p.age);

        Person p2 = new Person();
        p2.age = 35;
        p2.firstName = "Jack";
        p2.gender = 'M';
        p2.speak();

        System.out.println("p2.firstName = " + p2.firstName);
        System.out.println("p2.age = " + p2.age);
    }
}