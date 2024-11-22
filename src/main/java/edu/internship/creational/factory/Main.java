package edu.internship.creational.factory;

public class Main {
    public static void main(String[] args) {
        ComputerFactory factory = new LaptopFactory();

        System.out.println("Using Laptop Factory:");
        factory.testComputer();
        factory = new DesktopFactory();

        System.out.println("\nUsing Desktop Factory:");
        factory.testComputer();
    }
}
