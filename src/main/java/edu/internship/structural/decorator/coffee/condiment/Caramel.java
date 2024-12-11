package edu.internship.structural.decorator.coffee.condiment;

import edu.internship.structural.decorator.coffee.Beverage;

public class Caramel extends CondimentDecorator {

    public Caramel(Beverage beverage) {
        super("Caramel", beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 2.0;
    }
}
