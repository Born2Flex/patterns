package edu.internship.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Observer observer1 = new Customer("John");
        Observer observer2 = new Customer("Mary");
        Observer observer3 = new Customer("Paul");

        System.out.println("Subscribe John, Mary and Paul:");
        store.subscribe(observer1);
        store.subscribe(observer2);
        store.subscribe(observer3);
        System.out.println("Price in store updated:");
        store.updatePrice(500.0);
        System.out.println("Price in store updated:");
        store.updatePrice(520.5);

        System.out.println("Unsubscribed John from store:");
        store.unsubscribe(observer1);

        System.out.println("Price in store updated:");
        store.updatePrice(550.75);
    }
}
