package edu.internship.creational.abstract_factory.meal.factory;

import edu.internship.creational.abstract_factory.meal.dessert.Dessert;
import edu.internship.creational.abstract_factory.meal.dish.Dish;
import edu.internship.creational.abstract_factory.meal.drink.Drink;

public interface MealFactory {
    Dish createDish();
    Drink createDrink();
    Dessert createDessert();
}
