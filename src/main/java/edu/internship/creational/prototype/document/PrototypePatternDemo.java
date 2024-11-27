package edu.internship.creational.prototype.document;

import java.util.ArrayList;
import java.util.List;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        List<Document> documents = new ArrayList<>();

        Report report = new Report();
        report.setTitle("Monthly Report");
        report.setContent("Report content");
        report.setAuthor("John Doe");
        documents.add(report);

        Invoice invoice = new Invoice();
        invoice.setTitle("Invoice #123");
        invoice.setContent("Invoice details");
        invoice.setAmount(1234.56);
        documents.add(invoice);

        Contract contract = new Contract();
        contract.setTitle("Contract Agreement");
        contract.setContent("Contract terms");
        contract.setParty("ABC Corp");
        documents.add(contract);

        cloneAndCompare(documents);
    }

    private static void cloneAndCompare(List<Document> documents) {
        List<Document> copies = new ArrayList<>();

        for (Document document : documents) {
            copies.add(document.clone());
        }

        for (int i = 0; i < documents.size(); i++) {
            if (documents.get(i) != copies.get(i)) {
                System.out.println(i + ": Documents are different objects (yay!)");
                if (documents.get(i).equals(copies.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Document objects are the same (booo!)");
            }
        }
    }
}
