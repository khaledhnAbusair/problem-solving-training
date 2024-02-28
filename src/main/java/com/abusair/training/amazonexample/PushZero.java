package com.abusair.training.amazonexample;

public class PushZero {

    /*Driver function to check for above functions*/
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, -1, -5, -8, 7, 0, 6, 0, 9};
        int n = arr.length;
        System.out.println("Array before pushing zeros to the back: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        pushZerosToEnd(arr, n);
        System.out.println("\n" +
                "Array after pushing zeros to the back: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    private static void pushZerosToEnd(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }
        while (count < n)
            arr[count++] = 0;
    }
}
