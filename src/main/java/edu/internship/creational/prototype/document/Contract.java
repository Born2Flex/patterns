package edu.internship.creational.prototype.document;

public class Contract extends AbstractDocument {
    private String party;

    public Contract() {
    }

    public Contract(Contract target) {
        super(target);
        if (target != null) {
            this.party = target.party;
        }
    }

    @Override
    public Document clone() {
        return new Contract(this);
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Contract) || !super.equals(object2)) return false;
        Contract document2 = (Contract) object2;
        return document2.party.equals(party);
    }

    @Override
    public String toString() {
        return "Contract{" +
                "title='" + getTitle() + '\'' +
                ", content='" + getContent() + '\'' +
                ", party='" + party + '\'' +
                '}';
    }
}
