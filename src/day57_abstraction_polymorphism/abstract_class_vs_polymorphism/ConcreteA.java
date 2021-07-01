package day57_abstraction_polymorphism.abstract_class_vs_polymorphism;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {


    @Override
    public void abcMethodA() {
        System.out.println("abcMethodA implementation is called");
    }

    @Override
    public void methodB() {
        System.out.println("methodB overridden version is called");
    }

    //@Override -> static methods are hidden
    public static void staticMethodC() {
        System.out.println("staticMethodC hidden version is called");
    }


    @Override
    public void abcMethodD(int num) {
        System.out.println("absMethodD overridden version is called - " + num);
    }
}
