package edu.internship.creational.abstract_factory.gui.button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows-style button.");
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button clicked.");
    }
}
