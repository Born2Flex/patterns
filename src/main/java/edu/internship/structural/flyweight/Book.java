package edu.internship.structural.flyweight;

/**
 * @param type Intrinsic state
 */
public record Book(String name, double price, BookType type) {

    @Override
    public String toString() {
        return String.format("Book{name='%s', price=%.2f, type=%s}", name, price, type);
    }
}
