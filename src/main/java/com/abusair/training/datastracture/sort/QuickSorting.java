package com.abusair.training.datastracture.sort;

public class QuickSorting {

    static void QuickSort(int[] arr, int low, int high) {

        if (low > high)
            return;
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];
        while (low <= high) {
            while (arr[low] < pivot)
                low++;
            while (arr[high] > pivot)
                high--;

            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }

        }
        if (low < high)
            QuickSort(arr, low, high);
        if (high > low)
            QuickSort(arr, low, high);

    }

    public static void main(String[] args) {
        int[] arr = {1, 50, 30, 10, 60, 80};
        System.out.println("Before Sort");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");
        QuickSort(arr, 0, arr.length - 1);
        System.out.println("\nAfter Sort");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");
    }

}
