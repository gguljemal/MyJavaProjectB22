package day34_void_method;

public class FirstMethod {

    public static void main(String[] args) {

        displayMessage();  // 1st call the method
        displayMessage();  // 2nd call from method
        displayMessage();

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " - ");
            displayMessage();

        }
    }

    public static void displayMessage() {   ///   1st custom reusable method
        System.out.println("Hello B22 Friends!!!");
    }
}
