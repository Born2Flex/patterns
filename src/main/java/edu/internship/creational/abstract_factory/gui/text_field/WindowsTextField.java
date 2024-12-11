package edu.internship.creational.abstract_factory.gui.text_field;

public class WindowsTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering a Windows-style text field.");
    }

    @Override
    public void setText(String text) {
        System.out.println("Setting text in Windows TextField: " + text);
    }
}
