package edu.internship.creational.abstract_factory.gui.factory;

import edu.internship.creational.abstract_factory.gui.button.Button;
import edu.internship.creational.abstract_factory.gui.scroll_bar.ScrollBar;
import edu.internship.creational.abstract_factory.gui.button.WindowsButton;
import edu.internship.creational.abstract_factory.gui.scroll_bar.WindowsScrollBar;
import edu.internship.creational.abstract_factory.gui.text_field.TextField;
import edu.internship.creational.abstract_factory.gui.text_field.WindowsTextField;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }
}
