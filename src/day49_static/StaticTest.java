package day49_static;

public class StaticTest {

    public static void main(String[] args) {

        StaticMethods.displayMessage("wooden spoon");
        StaticMethods str = new StaticMethods();
        str.instanceMethod();
    }

}
