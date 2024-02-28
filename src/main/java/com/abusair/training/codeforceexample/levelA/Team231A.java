package com.abusair.training.codeforceexample.levelA;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Team231A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfProblems = Integer.valueOf(scanner.nextLine());
        Map<Integer, Integer> map = new HashMap<>();
        String arr[] = new String[numberOfProblems];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            String[] split = arr[i].split(" ");
            for (int j = 0; j < split.length; j++) {
                if (split[j].equalsIgnoreCase("1")) {
                    count++;
                }

            }

            map.put(i + 1, count);
        }
        int count = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();

    }

    public static void anotherMain(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int view = 0;
        int count = 0;
        int problemCount = 0;
        for (int i = 1; i <= n; i++) {
            count = 0;
            for (int j = 1; j <= 3; j++) {
                view = scanner.nextInt();
                if (view == 1)
                    count++;
            }
            if (count >= 2)
                problemCount++;
        }
        System.out.println(problemCount);
        scanner.close();

    }
}
