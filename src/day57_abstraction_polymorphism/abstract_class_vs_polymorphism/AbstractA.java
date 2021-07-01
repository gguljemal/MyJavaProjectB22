package day57_abstraction_polymorphism.abstract_class_vs_polymorphism;

public abstract class AbstractA {

    int num1;
    private double price;
    public static int count;
    public final String type = "abstract";
    public static final String LANGUAGE = "java";

    public AbstractA() {
        System.out.println("AbstractA constructor");
    }

    public abstract void abcMethodA();

    public void methodB() {
        System.out.println("methodB call");
    }

    public static void staticMethodC() {
        System.out.println("static methodC is called");
    }
}
