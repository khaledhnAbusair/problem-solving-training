package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class SoldierAndBananas546A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int w, k, n;
        String[] data = input.split(" ");
        k = Integer.valueOf(data[0]);
        n = Integer.valueOf(data[1]);
        w = Integer.valueOf(data[2]);

        int sum = 0;
        for (int i = 1; i < w + 1; i++)
            sum += k * i;
        System.out.println(sum - n < 0 ? 0 : sum - n);
        scanner.close();


    }
}
