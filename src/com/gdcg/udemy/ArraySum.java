package com.gdcg.udemy;

public class ArraySum {

    public static void main(String[] args) {

        // Initialize an array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Initialize Sum to zero
        int sum = 0;
        // Loop through an array to add all elements to sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Output the result
        System.out.println(sum);

    }

}
