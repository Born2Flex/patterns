package edu.internship.creational.abstract_factory.meal.factory;

import edu.internship.creational.abstract_factory.meal.dessert.Dessert;
import edu.internship.creational.abstract_factory.meal.dessert.SeafoodGelato;
import edu.internship.creational.abstract_factory.meal.dish.Dish;
import edu.internship.creational.abstract_factory.meal.dish.SeafoodSoup;
import edu.internship.creational.abstract_factory.meal.drink.Drink;
import edu.internship.creational.abstract_factory.meal.drink.WhiteWine;

public class SeaFoodMealFactory implements MealFactory {
    @Override
    public Dish createDish() {
        return new SeafoodSoup();
    }

    @Override
    public Drink createDrink() {
        return new WhiteWine();
    }

    @Override
    public Dessert createDessert() {
        return new SeafoodGelato();
    }
}
