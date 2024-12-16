package edu.internship.structural.flyweight;


public class BookType {

    private final String type;
    private final String distributor;
    private final String additionalInfo;

    public BookType(String type, String distributor, String additionalInfo) {
        this.type = type;
        this.distributor = distributor;
        this.additionalInfo = additionalInfo;
    }

    public String getType() {
        return type;
    }

    public String getDistributor() {
        return distributor;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

//    @Override
//    public String toString() {
//        return String.format("BookType{type='%s', distributor='%s', additionalInfo='%s'}", type, distributor, additionalInfo);
//    }
}
