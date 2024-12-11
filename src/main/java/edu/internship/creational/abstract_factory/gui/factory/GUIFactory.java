package edu.internship.creational.abstract_factory.gui.factory;

import edu.internship.creational.abstract_factory.gui.button.Button;
import edu.internship.creational.abstract_factory.gui.scroll_bar.ScrollBar;
import edu.internship.creational.abstract_factory.gui.text_field.TextField;

public interface GUIFactory {
    Button createButton();
    TextField createTextField();
    ScrollBar createScrollBar();
}