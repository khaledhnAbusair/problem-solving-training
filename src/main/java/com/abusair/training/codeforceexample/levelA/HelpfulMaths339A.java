package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class HelpfulMaths339A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split("\\+");
        if (input.contains("+")) {
            for (int i = 0; i < arr.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (Integer.valueOf(arr[j]) < Integer.valueOf(arr[index]))
                        index = j;
                }
                if (index != i) {
                    String temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                }
            }

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < arr.length; i++)
                builder.append(arr[i]).append("+");
            builder.deleteCharAt(builder.length() - 1);
            System.out.println(builder.toString());
        } else System.out.println(input);
    
        scanner.close();
    }
}
