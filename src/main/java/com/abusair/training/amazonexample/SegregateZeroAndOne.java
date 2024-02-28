package com.abusair.training.amazonexample;

public class SegregateZeroAndOne {

    // function to print segregated array
    static void print(int arr[], int n) {
        System.out.print("Array after segregation is ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // driver function
    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 0, 1, 1, 1};
        int n = arr.length;

        segregate0and1(arr, n);
        print(arr, n);

    }

    private static void segregate0and1(int[] arr, int n) {
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zeroCount++;
        }

        for (int i = 0; i < zeroCount; i++)
            arr[i] = 0;
        for (int i = zeroCount; i < n; i++)
            arr[i] = 1;
    }

}
