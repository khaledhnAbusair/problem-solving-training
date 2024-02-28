package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class Football96A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 1;
        int max = 0;
        String[] array = input.split("");
        if (!input.isEmpty() && array.length <= 100) {
            String v = array[0];
            for (int i = 1; i < array.length; i++) {
                if (v.equalsIgnoreCase(array[i])) {
                    count++;
                    if (count >= 7) {
                        max = count;
                        System.out.println("YES");
                        break;
                    }
                } else {
                    v = array[i];
                    count = 1;
                }
            }
            if (max < 7) System.out.println("NO");
        }
        scanner.close();
    }
/*
* Another solutions
*  String s = scanner.next();
        if(s.contains("1111111")||s.contains("0000000"))
            System.out.println("YES");
        else
            System.out.println("NO");
*
*
*
*
*
* */

}
