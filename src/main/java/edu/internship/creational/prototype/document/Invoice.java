package edu.internship.creational.prototype.document;

public class Invoice extends AbstractDocument {
    private double amount;

    public Invoice() {
    }

    public Invoice(Invoice target) {
        super(target);
        if (target != null) {
            this.amount = target.amount;
        }
    }

    @Override
    public Document clone() {
        return new Invoice(this);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Invoice) || !super.equals(object2)) return false;
        Invoice document2 = (Invoice) object2;
        return document2.amount == amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + getTitle() + '\'' +
                ", content='" + getContent() + '\'' +
                ", amount=" + amount +
                '}';
    }
}
