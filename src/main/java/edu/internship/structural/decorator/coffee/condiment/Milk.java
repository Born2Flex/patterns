package edu.internship.structural.decorator.coffee.condiment;

import edu.internship.structural.decorator.coffee.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super("Milk", beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }
}
