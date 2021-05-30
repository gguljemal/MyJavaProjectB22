package day35_methods_parameters;

public class MethodWithParameter {

    public static void main(String[] args) {
        displayValue(7);

        int count = 55;
        displayValue(count);

        greetByName("Maya");
        String name = "Gul";
        greetByName(name);
    }

    public static void displayValue(int num) {
        System.out.println("value is: " + num);
    }

    public static void greetByName(String name) {
        System.out.println("Hello " + name + ", how are you today?");
    }
}
