package edu.internship.structural.decorator.coffee.condiment;

import edu.internship.structural.decorator.coffee.Beverage;

public class Syrup extends CondimentDecorator {

    public Syrup(Beverage beverage) {
        super("Syrup", beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 3.0;
    }
}
