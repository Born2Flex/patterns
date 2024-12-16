package edu.internship.structural.bridge.shapes;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.print("Square filled with color ");
        color.applyColor();
    }
}