package edu.internship.creational.abstract_factory.gui.scroll_bar;

public class MacScrollBar implements ScrollBar {
    @Override
    public void render() {
        System.out.println("Rendering a MacOS-style scrollbar.");
    }

    @Override
    public void scroll() {
        System.out.println("Scrolling Mac scrollbar.");
    }
}
