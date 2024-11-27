package edu.internship.creational.prototype.registry;

import edu.internship.creational.prototype.document.Document;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        PrototypeRegistry registry = new PrototypeRegistry();

        Document clonedReport = registry.getPrototype("Report");
        Document clonedInvoice = registry.getPrototype("Invoice");
        Document clonedContract = registry.getPrototype("Contract");

        System.out.println("Cloned Report: " + clonedReport);
        System.out.println("Cloned Invoice: " + clonedInvoice);
        System.out.println("Cloned Contract: " + clonedContract);
    }
}
