package edu.internship.structural.decorator.coffee.condiment;

import edu.internship.structural.decorator.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    private final Beverage beverage;

    protected CondimentDecorator(String description, Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost();
    }

    @Override
    public String toString() {
        return beverage.toString() + ", " + super.toString();
    }
}
