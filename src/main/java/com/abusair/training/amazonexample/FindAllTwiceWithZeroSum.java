package com.abusair.training.amazonexample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindAllTwiceWithZeroSum {

    public static void main(String[] args) {
        int arr[] = new int[]{0, -1, 2, -3, 1, 0, 50, -50, 0};
        find(arr, arr.length);
        System.out.println("=========================================");
        findBestWay(arr, 0);
        System.out.println("=========================================");
        printSumPairs(arr, 0);
    }

    private static void find(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == 0)
                    System.out.println(arr[i] + " ," + arr[j]);
            }
        }
    }

    private static void findBestWay(int arr[], int sum) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];

            // checking for condition
            if (temp >= 0 && hashSet.contains(temp))
                System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
            hashSet.add(arr[i]);
        }
    }

    private static void printSumPairs(int[] input, int number) {
        Map<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            if (pairs.containsKey(input[i]))
                System.out.println("Pair with given number " + number + " is (" + input[i] + ", " + pairs.get(input[i]) + ")");
            else
                pairs.put(number - input[i], input[i]);
        }

    }
}
