package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class StringTask118A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = scanner.nextLine().toLowerCase().replaceAll("[aoyeui]", "");

        char[] chars = result.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char i : chars) {
            builder.append(".").append(i);
        }
        System.out.println(builder.toString());
        scanner.close();

    }
}
