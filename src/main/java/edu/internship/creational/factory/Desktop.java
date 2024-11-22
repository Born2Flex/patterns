package edu.internship.creational.factory;

public class Desktop implements Computer {
    @Override
    public void start() {
        System.out.println("Desktop is starting...");
    }

    @Override
    public void shutdown() {
        System.out.println("Desktop is shutting down...");
    }
}
