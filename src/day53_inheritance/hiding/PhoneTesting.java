package day53_inheritance.hiding;

public class PhoneTesting {

    public static void main(String[] args) {

        Phone phone = new Phone();
        Mobile mobile = new Mobile();

        phone.call();
        mobile.call();
        mobile.text();
    }
}
