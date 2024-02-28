package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class StonesOnTheTable266A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStones = Integer.valueOf(scanner.nextLine());
        String stoneColor = scanner.nextLine();
        String[] colors = stoneColor.split("");
        int count = 0;
        if (numberOfStones >= 1 && numberOfStones <= 50) {
            for (int i = 0; i < colors.length - 1; i++) {
                if (colors[i].equalsIgnoreCase(colors[i + 1])) {
                    count++;
                }
            }
        }
        System.out.println(count);
        scanner.close();

    }
}
