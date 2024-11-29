package edu.internship.creational.singleton.eager;

public enum EnumSingleton {

    INSTANCE;

    public static void doSomething() {
        System.out.println("I am singleton");
    }
}
