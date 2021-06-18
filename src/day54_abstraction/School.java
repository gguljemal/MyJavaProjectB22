package day54_abstraction;

public class School {

    public static void main(String[] args) {

        OnlineStudent student = new OnlineStudent();
        student.attendClass();
        student.code("Java");

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();
        campusStudent.code("C++");

    }
}
