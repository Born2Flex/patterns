package edu.internship.behavioral.iterator.list;

import java.util.*;

public class RandomIterator<T> implements Iterator<T> {
    private List<T> list;
    private List<Integer> indices;
    private Random random;

    public RandomIterator(List<T> list) {
        this.list = new ArrayList<>(list);
        this.indices = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            indices.add(i);
        }
        this.random = new Random();
    }

    @Override
    public boolean hasNext() {
        return !indices.isEmpty();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements to return.");
        }
        int randomIndex = random.nextInt(indices.size());
        int actualIndex = indices.remove(randomIndex);
        return list.get(actualIndex);
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        RandomIterator<Integer> randomIterator = new RandomIterator<>(numbers);

        while (randomIterator.hasNext()) {
            System.out.println(randomIterator.next());
        }

        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");
        RandomIterator<String> fruitIterator = new RandomIterator<>(fruits);

        System.out.println("----------------");
        while (fruitIterator.hasNext()) {
            System.out.println(fruitIterator.next());
        }
    }
}
