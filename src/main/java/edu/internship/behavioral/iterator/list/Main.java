package edu.internship.behavioral.iterator.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("----------------");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Watermelon");

        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }
        System.out.println("----------------");
        listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            if (fruit.equals("Banana")) {
                listIterator.set("Blueberry");
            }
        }
        System.out.println("After modification (set): " + fruits);
        System.out.println("----------------");

        listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            if (fruit.equals("Cherry")) {
                listIterator.add("Elderberry");
                break;
            }
        }

        System.out.println("After adding an element: " + fruits);
        System.out.println("----------------");
        System.out.println("Backward iteration:");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }
        System.out.println("----------------");
        listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            int nextIndex = listIterator.nextIndex();
            int previousIndex = listIterator.previousIndex();
            System.out.println("Current: " + fruit + ", Previous Index: " + previousIndex + ", Next Index: " + nextIndex);
        }
    }
}
