package edu.internship.structural.decorator.coffee;

import edu.internship.structural.decorator.coffee.condiment.Caramel;
import edu.internship.structural.decorator.coffee.condiment.Milk;
import edu.internship.structural.decorator.coffee.condiment.Syrup;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Latte();
        System.out.println("Latte cost: " + beverage.cost());
        beverage = new Caramel(beverage);
        System.out.println("Latte with Caramel cost: " + beverage.cost());
        beverage = new Milk(beverage);
        System.out.println("Latter with Caramel and Milk cost: " + beverage.cost());
        beverage = new Syrup(beverage);
        System.out.println("Latte with Caramel, Milk and Syrup cost: " + beverage.cost());
    }
}
