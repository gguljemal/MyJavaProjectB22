package day45_oop;

public class TrafficLightObjects {

    public static void main(String[] args) {

        TrafficLight t1 = new TrafficLight();

        t1.changeColor("green");
        t1.showColor();
        t1.changeColor("red");
        t1.showColor();

        TrafficLight t2 = new TrafficLight();

        t2.changeColor("orange");
        t2.showColor();
    }
}
