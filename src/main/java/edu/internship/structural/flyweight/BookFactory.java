package edu.internship.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BookFactory {
    private static final Map<String, BookType> bookTypes = new ConcurrentHashMap<>();

    public static BookType getBookType(String type, String distributor, String additionalInfo) {
        return bookTypes.computeIfAbsent(type, t -> new BookType(t, distributor, additionalInfo));
    }
}