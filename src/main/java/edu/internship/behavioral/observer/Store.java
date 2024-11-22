package edu.internship.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Observer> observers = new ArrayList<>();
    private double currentPrice;

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void updatePrice(double price) {
        currentPrice = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentPrice);
        }
    }
}
