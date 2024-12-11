package edu.internship.creational.abstract_factory.meal.dish;

public class SeafoodSoup implements Dish {
    @Override
    public void prepare() {
        System.out.println("Preparing Seafood Soup with shrimp, fish, and seaweed.");
    }
}
