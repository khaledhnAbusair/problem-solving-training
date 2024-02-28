package com.abusair.training.datastracture.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp <= array[j]) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
        System.out.println("printing sorted elements ...");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " , ");
        }
    }
}
