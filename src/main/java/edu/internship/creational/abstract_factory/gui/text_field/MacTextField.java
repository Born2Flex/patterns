package edu.internship.creational.abstract_factory.gui.text_field;

// MacTextField.java - Concrete Product for MacOS
public class MacTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering a MacOS-style text field.");
    }

    @Override
    public void setText(String text) {
        System.out.println("Setting text in Mac TextField: " + text);
    }
}
