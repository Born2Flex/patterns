package edu.internship.behavioral.iterator.graph;

public interface Iterator<T> {

    boolean hasNext();

    Vertex<T> getNext();

    void reset();

}