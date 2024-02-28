package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class Twins160A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCoins = scanner.nextInt();
        int[] coins = new int[numberOfCoins];
        int sum = 0;
        for (int i = 0; i < numberOfCoins; i++) {
            coins[i] = scanner.nextInt();
            sum += coins[i];
        }
        sum = sum / 2;
        selectionSortArray(coins);

        int k = 0, k1 = 0;
        for (int i = numberOfCoins - 1; i > 0; i--) {
            k1 += coins[i];
            if (k1 > sum)
                break;
            else
                k++;
        }
        System.out.println(k + 1);
        scanner.close();

    }

    public static void selectionSortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index])
                    index = j;
            }
            if (index != i) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
