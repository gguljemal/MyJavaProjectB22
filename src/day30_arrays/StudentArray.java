package day30_arrays;

public class StudentArray {

    public static void main(String[] args) {

        String[] student1 = new String[5];
        student1[0] = "AD123";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-1234";

        // when you know values, use this one if not use above one
        String[] student2 = {"123", "Maya", "Gurban", "B22", "556669888"};

        System.out.println("Student1 id = " + student1[0]);
        System.out.println("Student1 firstname = " + student1[1]);
        System.out.println("Student1 lastname = " + student1[2]);
        System.out.println("Student1 batch num = " + student1[3]);
        System.out.println("Student1 mobile number = " + student1[4]);
        System.out.println("length of the student1 = " + student1.length);

        System.out.println("Student2 id = " + student2[0]);
        System.out.println("Student2 firstname = " + student2[1]);
        System.out.println("Student2 lastname = " + student2[2]);
        System.out.println("Student2 batch num = " + student2[3]);
        System.out.println("Student2 mobile number = " + student2[4]);
        System.out.println("student2.length = " + student2.length);

        /*
        1-  check if student1 data array contains 5 items
        ture -> PASS: data array has correct length
        false -> FAIL: data array has incorrect length

        2- check if student1 and student2 arrays have same number of data
        TRUE: PASS: data arrays length match
        FALSE: FAIL: data arrays  length mismatch
         */

        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");
        }

        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("FAIL: data arrays  length mismatch");
        }

        // read from array and print firstname and lastname in all uppercase "ADAM SMITH"

        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        //read mobile from array and store into variable
        String mobileNum = student1[4];
        System.out.println("mobileNum = " + mobileNum);
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202"));

    }
}
