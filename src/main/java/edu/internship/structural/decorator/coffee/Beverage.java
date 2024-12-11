package edu.internship.structural.decorator.coffee;

public abstract class Beverage {
    private String description;

    protected Beverage(String description) {
        this.description = description;
    }

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public Beverage setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return description;
    }
}
