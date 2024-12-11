package edu.internship.creational.abstract_factory.gui.scroll_bar;

public class WindowsScrollBar implements ScrollBar {
    @Override
    public void render() {
        System.out.println("Rendering a Windows-style scrollbar.");
    }

    @Override
    public void scroll() {
        System.out.println("Scrolling Windows scrollbar.");
    }
}
