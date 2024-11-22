package edu.internship.creational.factory;

public abstract class ComputerFactory {
    public abstract Computer createComputer();

    public void testComputer() {
        Computer computer = createComputer();
        computer.start();
        computer.shutdown();
    }
}
