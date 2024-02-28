package com.abusair.training.amazonexample;

public class MinMaxElementInArray {
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, -1, -5, -8, 7, 0, 6, 0, 9};
        int n = arr.length;
        findMinMax(arr, n);
    }

    private static void findMinMax(int arr[], int length) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < length - 1; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }

        System.out.println("min: " + min + "\nmax: " + max);
    }
}
