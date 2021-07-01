package day58_polymorphism;

public class SuperManTest {

    public static void main(String[] args) {

        Father father1 = new Father();
        father1.raiseKid();
        father1.playWithKid();
        father1.raiseKid();

        SuperMan superMan = new SuperMan();
        System.out.println("superMan.getPayed() = " + superMan.getPayed());
        superMan.worker("teacher");
        superMan.feedKid();
        superMan.playWithKid();
        superMan.raiseKid();
        superMan.getPayed();

        Father father = new SuperMan();
        father.feedKid();
        father.playWithKid();
        father.raiseKid();

        Worker worker = new SuperMan();
        worker.getPayed();
        worker.worker("SDET");

    }
}
