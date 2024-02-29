package com.abusair.training.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static void main(String[] args) {
        System.out.println(migratoryBirds(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
        System.out.println(migratoryBirds2(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }

    public static int migratoryBirds2(List<Integer> arr) {
        int[] frequency = new int[arr.size() - 1]; // We add 1 extra space for bird types from 1 to 5 (inclusive)

        // Count the frequency of each bird type
        for (int birdType : arr) {
            frequency[birdType]++;
        }

        // Find the most frequently sighted bird type
        int maxFrequency = 0;
        int mostFrequentNumber = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentNumber = i;
            }
        }

        return mostFrequentNumber;
    }

    public static int migratoryBirds(List<Integer> arr) {

        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array and count the frequency of each bird type
        for (int birdType : arr)
            map.put(birdType, map.getOrDefault(birdType, 0) + 1);


        // Find the bird type with the maximum frequency
        int maxFrequency = 0;
        int mostFrequentBird = Integer.MAX_VALUE; // Initialize to maximum possible value
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > maxFrequency || (value == maxFrequency && key < mostFrequentBird)) {
                maxFrequency = value;
                mostFrequentBird = key;
            }
        }

        return mostFrequentBird;
    }
}
