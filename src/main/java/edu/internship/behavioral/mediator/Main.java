package edu.internship.behavioral.mediator;

import edu.internship.behavioral.mediator.components.AddButton;
import edu.internship.behavioral.mediator.components.DeleteButton;
import edu.internship.behavioral.mediator.components.Filter;
import edu.internship.behavioral.mediator.components.List;
import edu.internship.behavioral.mediator.components.SaveButton;
import edu.internship.behavioral.mediator.components.TextBox;
import edu.internship.behavioral.mediator.components.Title;
import edu.internship.behavioral.mediator.mediator.Editor;
import edu.internship.behavioral.mediator.mediator.Mediator;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel<>()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}