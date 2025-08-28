package com.gdcg.udemy;

public class BubbleSort {

    public static void main(String[] args) {

        // Initialize the array
        int[] numbers = { 5, 2, 9, 1, 5, 6 };

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted Array: ");
        for (int num : numbers) {
            System.out.println(num + " ");
        }

    }

}
