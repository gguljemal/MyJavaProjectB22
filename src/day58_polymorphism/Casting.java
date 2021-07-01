package day58_polymorphism;

public class Casting {

    public static void main(String[] args) {

        //variable of worker and object of superMan
        Worker worker = new SuperMan();
        worker.worker("QA manager");
        worker.getPayed();

        ((Father) worker).raiseKid();
        ((SuperMan) worker).playWithKid();

        //DOWNCASTING FROM WORKER TO SUPERMAN
        SuperMan superMan = (SuperMan) worker;
        superMan.feedKid();
        superMan.worker("java dev");
    }
}
