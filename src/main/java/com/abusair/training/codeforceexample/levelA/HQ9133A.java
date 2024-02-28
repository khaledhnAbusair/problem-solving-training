package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class HQ9133A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.contains("H") || input.contains("Q") || input.contains("9"))
            System.out.println("YES");
        else System.out.println("NO");
        scanner.close();
    }
}
