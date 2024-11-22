package edu.internship.creational.factory;

public class DesktopFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Desktop();
    }
}
