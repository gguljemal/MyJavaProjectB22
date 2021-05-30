package day35_methods_parameters;

public class Counter {

    public static void main(String[] args) {

        count(5);
        count(7);

        String word = "wooden spoon";
        count(word.length());

        printAge(1986);
        int birthYear = 2001;
        printAge(birthYear);
    }

    public static void count(int num) {

        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printAge(int year) {
        System.out.println("Birth year: " + year + ". Age " + (2021 - year));
    }
}
