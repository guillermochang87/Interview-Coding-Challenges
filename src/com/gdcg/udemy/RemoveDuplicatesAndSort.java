package com.gdcg.udemy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesAndSort {

    public static void main(String[] args) {

        int[] arr = { 4, 2, 7, 2, 9, 4, 1, 5, 9 };

        // Printing an original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Print tthe array in ascending order
        Arrays.sort(arr);

        // Printing the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Create a Set from the sorted array to remove duplicates
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        // Converting the Set back to array
        Integer[] resultArray = set.toArray(new Integer[0]);

        // Printing the final array with no duplicates
        System.out.println("Sorted array without duplicates: " + Arrays.toString(resultArray));

    }

}
