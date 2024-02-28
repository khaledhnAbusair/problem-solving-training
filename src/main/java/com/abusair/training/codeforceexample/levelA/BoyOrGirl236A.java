package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class BoyOrGirl236A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] arr = input.split("");
        StringBuilder result = new StringBuilder();
        if (!input.isEmpty()) {
            for (int i = 0; i < arr.length; i++) {
                if (!result.toString().contains(arr[i]))
                    result.append(arr[i]);
            }
        }
        scanner.close();
        if (result.length() % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
        
    }
}
