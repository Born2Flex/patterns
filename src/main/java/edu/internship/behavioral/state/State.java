package edu.internship.behavioral.state;

public abstract class State {
    protected Phone phone;

    protected State(Phone phone) {
        this.phone = phone;
    }

    public abstract String onHome();

    public abstract String onOffOn();
}
