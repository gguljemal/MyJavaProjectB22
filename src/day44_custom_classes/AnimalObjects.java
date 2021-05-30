package day44_custom_classes;

public class AnimalObjects {

    public static void main(String[] args) {

        Animal a = new Animal();

        a.eat();
        System.out.println(a.type);
        a.eat("grass");
        a.speak();

        Animal cheetah = new Animal();
        cheetah.type = "cheetah";
        System.out.println("cheetah.type = " + cheetah.type);
        cheetah.eat("meat");
        cheetah.eat();
    }

}
