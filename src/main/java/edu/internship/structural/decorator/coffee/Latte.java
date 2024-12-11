package edu.internship.structural.decorator.coffee;

public class Latte extends Beverage {
    public Latte() {
        super("Latte");
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
