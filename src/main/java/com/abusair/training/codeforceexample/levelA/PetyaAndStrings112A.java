package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class PetyaAndStrings112A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        if (input1.compareToIgnoreCase(input2) < 0)
            System.out.println("-1");
        else if (input1.compareToIgnoreCase(input2) > 0)
            System.out.println("1");
        else
            System.out.println("0");
        scanner.close();

    }

    public static void mainTwo(String[] args) {
        //TODO Another solution
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next().toLowerCase();
        String b = scanner.next().toLowerCase();

        if (a.equals(b)) {
            System.out.println("0");
        } else {
            for (int i = 0; i < a.length(); i++) {
                if ((int) a.charAt(i) > (int) b.charAt(i)) {
                    System.out.println("1");
                    break;
                } else if ((int) a.charAt(i) == (int) b.charAt(i))
                    continue;
                else {
                    System.out.println("-1");
                    break;
                }
            }
        }
        scanner.close();

    }
}
