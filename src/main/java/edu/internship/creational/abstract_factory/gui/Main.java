package edu.internship.creational.abstract_factory.gui;

import edu.internship.creational.abstract_factory.gui.factory.GUIFactory;
import edu.internship.creational.abstract_factory.gui.factory.MacFactory;
import edu.internship.creational.abstract_factory.gui.factory.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = getGuiFactory("Mac");
        Application app = new Application(factory);
        app.renderUI();
        System.out.println();

        factory = getGuiFactory("Windows");
        Application app2 = new Application(factory);
        app2.renderUI();
    }

    private static GUIFactory getGuiFactory(String platform) {
        return switch (platform) {
            case "Mac" -> new MacFactory();
            case "Windows" -> new WindowsFactory();
            default -> throw new IllegalArgumentException("Unsupported platform: " + platform);
        };
    }
}
