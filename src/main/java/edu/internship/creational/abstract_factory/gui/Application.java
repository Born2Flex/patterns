package edu.internship.creational.abstract_factory.gui;

import edu.internship.creational.abstract_factory.gui.button.Button;
import edu.internship.creational.abstract_factory.gui.factory.GUIFactory;
import edu.internship.creational.abstract_factory.gui.scroll_bar.ScrollBar;
import edu.internship.creational.abstract_factory.gui.text_field.TextField;

public class Application {
    private final Button button;
    private final TextField textField;
    private final ScrollBar scrollBar;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        textField = factory.createTextField();
        scrollBar = factory.createScrollBar();
    }

    public void renderUI() {
        button.render();
        button.onClick();
        textField.render();
        textField.setText("Hello, World!");
        scrollBar.render();
        scrollBar.scroll();
    }
}