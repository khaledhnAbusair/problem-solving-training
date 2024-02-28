package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class BitPlusPlus282A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLine = Integer.valueOf(scanner.nextLine());
        int result = 0;
        for (int i = 0; i < numberOfLine; i++) {
            String s = scanner.nextLine();
            if (s.substring(0, 1).equalsIgnoreCase("+"))
                ++result;
            else if (s.substring(s.length() - 1).equalsIgnoreCase("+"))
                result++;

            if (s.substring(0, 1).equalsIgnoreCase("-"))
                --result;
            else if (s.substring(s.length() - 1).equalsIgnoreCase("-"))
                result--;

        }
        System.out.println(result);
        scanner.close();
    }
}
