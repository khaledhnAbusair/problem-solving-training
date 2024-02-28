package com.abusair.training.datastracture.sort;

import com.abusair.training.codeforceexample.levelA.Twins160A;

public class SelectionSorting {
    static void SelectionSort(int[] arr) {
        Twins160A.selectionSortArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 50, 30, 10, 60, 80};
        System.out.println("Before Sort");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");
        SelectionSort(arr);
        System.out.println("\nAfter Sort");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");
    }

}
