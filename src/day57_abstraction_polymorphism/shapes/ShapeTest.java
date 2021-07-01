package day57_abstraction_polymorphism.shapes;

import day55_abstraction.exercise_example.Lifting;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        triangle.draw();
        shape1.draw();
        shape2.draw();

        /**
         * single variable of parent type, and different objects of child types
         */

        Shape shape = new Triangle();
        shape.draw();
        shape = new Circle();
        shape.draw();
        shape = new Square();
        shape.draw();

        /**
         * create list of Shapes and store 10 different shapes
         * using a loop print out each shape
         */

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());

        for (Shape each : shapes) {
            each.draw();
        }

        drawShape(new Circle());
        drawShape(new Square());
        drawShape(triangle);


        /**
         * static method: drawShape
         * accepts object of shape
         * then calls draw() method
         */
    }

    public static void drawShape(Shape shape) {
        System.out.println("----Drawing shape----");
        shape.draw();
    }
}
