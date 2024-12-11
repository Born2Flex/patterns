package edu.internship.creational.abstract_factory.gui.factory;

import edu.internship.creational.abstract_factory.gui.button.Button;
import edu.internship.creational.abstract_factory.gui.scroll_bar.ScrollBar;
import edu.internship.creational.abstract_factory.gui.button.MacButton;
import edu.internship.creational.abstract_factory.gui.scroll_bar.MacScrollBar;
import edu.internship.creational.abstract_factory.gui.text_field.TextField;
import edu.internship.creational.abstract_factory.gui.text_field.MacTextField;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextField createTextField() {
        return new MacTextField();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacScrollBar();
    }
}
