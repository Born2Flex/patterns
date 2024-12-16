package edu.internship.behavioral.mediator.components;

import edu.internship.behavioral.mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}