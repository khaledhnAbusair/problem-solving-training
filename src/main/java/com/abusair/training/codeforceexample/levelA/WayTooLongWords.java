package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class WayTooLongWords {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordNumber = scanner.nextInt();
        String arr[] = new String[wordNumber];
        for (int i = 0; i < wordNumber; i++)
            arr[i] = scanner.next();

        for (int i = 0; i < wordNumber; i++) {
            int inputLength = arr[i].length();
            if (inputLength <= 10)
                System.out.println(arr[i]);
            else
                System.out.println(arr[i].substring(0, 1) + ((inputLength - 1) - 1) + arr[i].substring(inputLength - 1, inputLength));
        }

        scanner.close();

    }
}
