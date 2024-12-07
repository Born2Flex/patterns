package edu.internship.behavioral.iterator.graph;


import java.util.LinkedList;
import java.util.List;

public class Vertex<T> {

    private final T data;

    private boolean visited;

    private List<Vertex<T>> neighbors = new LinkedList<>();

    public Vertex(T data) {
        this.data = data;
    }

    public Vertex(T data, boolean visited) {
        this.data = data;
        this.visited = visited;
    }

    public T getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public Vertex<T> setVisited(boolean visited) {
        this.visited = visited;
        return this;
    }

    public List<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    public Vertex<T> setNeighbors(List<Vertex<T>> neighbors) {
        this.neighbors = neighbors;
        return this;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                ", visited=" + visited;
    }
}