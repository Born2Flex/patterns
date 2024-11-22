package edu.internship.creational.factory;

public class Laptop implements Computer {
    @Override
    public void start() {
        System.out.println("Laptop is starting...");
    }

    @Override
    public void shutdown() {
        System.out.println("Laptop is shutting down...");
    }
}
