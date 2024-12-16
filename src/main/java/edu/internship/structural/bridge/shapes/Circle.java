package edu.internship.structural.bridge.shapes;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.print("Circle filled with color ");
        color.applyColor();
    }
}