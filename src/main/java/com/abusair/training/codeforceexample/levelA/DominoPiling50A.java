package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class DominoPiling50A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        if (m >= 1 && n >= m && n <= 16)
            System.out.println((m * n) / 2);
        //TODO Square and rectangle space (length * Width)
        //TODO Square and rectangle Size or block (length * width) *Height
        scanner.close();
    }
}
