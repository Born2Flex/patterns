package edu.internship.behavioral.observer;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(name + " received product price update: " + price);
    }
}
