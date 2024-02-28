package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class CapsLock131A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countSmall = 0;
        int countCapital = 0;
        if (!input.isEmpty()) {
            if (input.length() > 1) {
                if (Character.isLowerCase(input.charAt(0))) {
                    for (int i = 1; i < input.length(); i++) {
                        if (Character.isLowerCase(input.charAt(i)))
                            countSmall++;
                    }
                    if (countSmall > 0) {
                        System.out.println(input);
                    } else
                        System.out.println(input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase());
                } else {
                    if (Character.isUpperCase(input.charAt(0))) {
                        for (int i = 1; i < input.length(); i++) {
                            if (Character.isUpperCase(input.charAt(i)))
                                countCapital++;
                        }
                        if (countCapital + 1 == input.length())
                            System.out.println(input.toLowerCase());
                        else
                            System.out.println(input);
                    }
                }
            } else {
                if (Character.isLowerCase(input.charAt(0)))
                    System.out.println(input.toUpperCase());
                else System.out.println(input.toLowerCase());
            }
        }
        scanner.close();
    }
}
