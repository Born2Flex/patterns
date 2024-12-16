package edu.internship.structural.bridge.shapes;

public abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    abstract void applyColor();
}