package edu.internship.creational.abstract_factory.meal.factory;

import edu.internship.creational.abstract_factory.meal.dessert.ApplePie;
import edu.internship.creational.abstract_factory.meal.dessert.Dessert;
import edu.internship.creational.abstract_factory.meal.dish.Dish;
import edu.internship.creational.abstract_factory.meal.dish.Salad;
import edu.internship.creational.abstract_factory.meal.drink.Drink;
import edu.internship.creational.abstract_factory.meal.drink.Soda;

public class RegularMealFactory implements MealFactory{
    @Override
    public Dish createDish() {
        return new Salad();
    }

    @Override
    public Drink createDrink() {
        return new Soda();
    }

    @Override
    public Dessert createDessert() {
        return new ApplePie();
    }
}
