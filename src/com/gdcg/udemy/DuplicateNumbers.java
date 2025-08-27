package com.gdcg.udemy;

import java.util.HashSet;

public class DuplicateNumbers {

    public static void main(String[] args) {

        // Step 1: Initialize an array
        int[] nums = { 1, 2, 3, 4, 7, 8, 9, 7, 3 };

        // Step 2: Create a HashSet to store unique numbers
        HashSet<Integer> seen = new HashSet<>();

        // Iterate over the array and find duplicates
        System.out.println("Cuplicates numbers in an array: ");
        for (int num : nums) {
            // Step 4: Check if the number is already in the HashSet
            if (seen.contains(num)) {
                // If the number is in the HashSet, it is a duplicate
                System.out.println(num);
            } else {
                // If the number is not in the HashSet we need to add it
                seen.add(num);
            }

        }

    }

}
