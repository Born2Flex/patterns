package edu.internship.structural.decorator.coffee;

public class Espresso extends Beverage {

    public Espresso() {
        super("Espresso");
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
