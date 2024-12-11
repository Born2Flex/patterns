package edu.internship.creational.abstract_factory.gui.button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a MacOS-style button.");
    }

    @Override
    public void onClick() {
        System.out.println("Mac Button clicked.");
    }
}
