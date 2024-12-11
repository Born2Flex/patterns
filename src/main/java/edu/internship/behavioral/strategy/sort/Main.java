package edu.internship.behavioral.strategy.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        SortContext sortContext = new SortContext(new BubbleSortStrategy());
        System.out.println("Using Bubble Sort:");
        sortContext.sort(array);
        printArray(array);

        int[] array2 = {5, 2, 9, 1, 5, 6};
        sortContext.setSortStrategy(new QuickSortStrategy());
        System.out.println("\nUsing Quick Sort:");
        sortContext.sort(array2);
        printArray(array2);

        int[] array3 = {5, 2, 9, 1, 5, 6};
        sortContext.setSortStrategy(new MergeSortStrategy());
        System.out.println("\nUsing Merge Sort:");
        sortContext.sort(array3);
        printArray(array3);

        List<Integer> list = new ArrayList<>(List.of(9,7,6,55,3,4,10));
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

