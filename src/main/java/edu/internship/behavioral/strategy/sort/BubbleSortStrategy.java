package edu.internship.behavioral.strategy.sort;

public class BubbleSortStrategy implements SortStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("Performing Bubble Sort");
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort completed");
    }
}
