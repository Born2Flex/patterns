package edu.internship.structural.bridge.shapes;

public class Main {
    public static void main(String[] args) {
        Color blue = new Blue();
        Shape square = new Square(blue);

        Color red = new Red();
        Shape circle = new Circle(red);

        square.applyColor();
        circle.applyColor();

        Color green = new Green();
        Shape greenCircle = new Circle(green);
        greenCircle.applyColor();
    }
}