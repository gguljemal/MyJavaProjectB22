package day61_exceptions_collections;

public class ElementaryStudentTests {

    public static void main(String[] args) {

        try {
            ElementaryStudent student = new ElementaryStudent();
            student.setAge(33);
            student.setName("Bob");
            System.out.println(student.toString());
        } catch (Exception e) {
            e.printStackTrace();  //print error stack trace and continue. does not stop code
        }

        System.out.println("--- EXECUTION COMPLETED ---");
    }
}
