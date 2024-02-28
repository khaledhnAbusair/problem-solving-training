package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class TheatreSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double m = scanner.nextInt();
        double a = scanner.nextInt();
        // System.out.println((long) (n + a - 1) / a * ((m + a - 1) / a));
        System.out.println((long) (Math.ceil(n / a) * Math.ceil(m / a)));
        scanner.close();

    }
}