package day50_inheritance;

public class InheritanceTest {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Bakit";
        p1.age = 33;


        p1.walk();
        p1.talk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Saim";
        t1.age = 33;
        t1.teach("Java");
        t1.walk();
        t1.talk();

        Student s1 = new Student();
        s1.name = "Ali";
        s1.age = 33;
        s1.school = "Cybertek";
        s1.walk();
        s1.talk();
        s1.work("company");
        s1.study();

        // checking
    }
}
