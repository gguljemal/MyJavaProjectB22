package day36_methods_with_return;

import java.util.Random;

public class Info {

    public static void main(String[] args) {

        fullName();
        System.out.println("Full name = " + fullName());

        System.out.println(isMarried());
        System.out.println("married? = " + isMarried());

        System.out.println("age" + getAge());

        System.out.println(getRandomYear());

        // putting return methods to variables
        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("year = " + year);
        System.out.println("age = " + age);
        System.out.println("married = " + married);
        System.out.println("name = " + name);

    }

    public static String fullName() {
        System.out.println("inside fullName method");
        return "Mike Smith";
    }

    public static boolean isMarried() {
        return false;
    }

    public static int getAge() {
        int age = 35;
        return age;
        //    return 35;  same as above
    }

    public static int getRandomYear() {

        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}

