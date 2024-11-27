package edu.internship.creational.prototype.registry;

import edu.internship.creational.prototype.document.Contract;
import edu.internship.creational.prototype.document.Document;
import edu.internship.creational.prototype.document.Invoice;
import edu.internship.creational.prototype.document.Report;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, Document> prototypes = new HashMap<>();

    public PrototypeRegistry() {
        loadPrototypes();
    }

    public Document getPrototype(String type) {
        Document prototype = prototypes.get(type);
        return prototype != null ? prototype.clone() : null;
    }

    private void loadPrototypes() {
        Report report = new Report();
        report.setTitle("Monthly Report");
        report.setContent("Report content");
        report.setAuthor("John Doe");
        prototypes.put("Report", report);

        Invoice invoice = new Invoice();
        invoice.setTitle("Invoice #123");
        invoice.setContent("Invoice details");
        invoice.setAmount(1234.56);
        prototypes.put("Invoice", invoice);

        Contract contract = new Contract();
        contract.setTitle("Contract Agreement");
        contract.setContent("Contract terms");
        contract.setParty("ABC Corp");
        prototypes.put("Contract", contract);
    }
}
