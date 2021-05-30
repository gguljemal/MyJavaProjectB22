package day44_custom_classes;

public class myApp {

    public static void main(String[] args) {

        App p1 = new App();

        p1.open(); // before assigning values to instance variable

        p1.version = 102.36;
        p1.name = "Electronic";
        p1.open();
    }
}
