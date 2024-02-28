package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class Tram116A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = 0;
        int currentPassengers = 0;

        for (int i = 0; i < n; i++) {
            int nezlo = scanner.nextInt();
            int tel3o = scanner.nextInt();
            currentPassengers += tel3o;
            currentPassengers -= nezlo;
            if (currentPassengers > capacity)
                capacity = currentPassengers;

        }
        System.out.println(capacity);
        scanner.close();

    }
}
