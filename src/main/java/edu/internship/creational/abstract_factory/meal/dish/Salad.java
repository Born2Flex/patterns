package edu.internship.creational.abstract_factory.meal.dish;

public class Salad implements Dish {
    @Override
    public void prepare() {
        System.out.println("Preparing Salad with lettuce, tomatoes, and dressing.");
    }
}
