package edu.internship.creational.abstract_factory;

import edu.internship.creational.abstract_factory.meal.factory.MealFactory;
import edu.internship.creational.abstract_factory.meal.factory.RegularMealFactory;
import edu.internship.creational.abstract_factory.meal.factory.SeaFoodMealFactory;

public class Main {
    public static void main(String[] args) {
        MealFactory mealFactory = new RegularMealFactory();
        serveMeal(mealFactory);
        System.out.println();
        mealFactory = new SeaFoodMealFactory();
        serveMeal(mealFactory);
    }

    public static void serveMeal(MealFactory mealFactory) {
        mealFactory.createDish().prepare();
        mealFactory.createDrink().serve();
        mealFactory.createDessert().prepare();
    }
}
